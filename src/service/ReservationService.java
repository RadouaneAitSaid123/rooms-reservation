package service;

import connexion.Connexion;
import dao.IDAO;
import entities.Chambre;
import entities.Client;
import entities.Reservation;
import entities.ReservationStatus;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService implements IDAO<Reservation> {

    @Override
    public boolean creat(Reservation o) {

        if (o == null || o.getClient() == null || o.getChambre() == null) {
            System.out.println("Client ou Chambre est null");
            return false;
        }

        String req = "INSERT INTO reservation (dateDebut, dateFin, client_id, chambre_id, status) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);

            ps.setDate(1, new java.sql.Date(o.getDateDebut().getTime()));
            ps.setDate(2, new java.sql.Date(o.getDateFin().getTime()));
            ps.setInt(3, o.getClient().getId());
            ps.setInt(4, o.getChambre().getId());
            ps.setString(5, o.getStatus().getValue());

            if (ps.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de la création de la réservation : " + e.getMessage());
        }

        return false;
    }

    @Override
    public boolean update(Reservation o) {
        String req = "UPDATE reservation SET dateDebut = ?, dateFin = ?, client_id = ?, chambre_id = ?, status = ? WHERE id = ?";

        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {

            ps.setDate(1, new java.sql.Date(o.getDateDebut().getTime()));
            ps.setDate(2, new java.sql.Date(o.getDateFin().getTime()));

            if (o.getClient() != null) {
                ps.setInt(3, o.getClient().getId());
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }

            if (o.getChambre() != null) {
                ps.setInt(4, o.getChambre().getId());
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }

            ps.setString(5, o.getStatus().getValue());
            ps.setInt(6, o.getId());

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(Reservation o) {
        if (o == null) {
            throw new IllegalArgumentException("La réservation est null !");
        }
        String req = "DELETE FROM reservation WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("Erreur lors de la suppression de la reservation avec ID " + o.getId() + " : " + e.getMessage());
        }
        return false;
    }

    @Override
    public Reservation findById(int id) {
        String req = "SELECT * FROM reservation WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Date dateDebut = rs.getDate("dateDebut");
                Date dateFin = rs.getDate("dateFin");
                int clientId = rs.getInt("client_id");
                int chambreId = rs.getInt("chambre_id");

                Client client = new ClientService().findById(clientId);
                Chambre chambre = new ChambreService().findById(chambreId);

                String statusString = rs.getString("status");
                ReservationStatus status = ReservationStatus.fromValue(statusString);

                return new Reservation(id, dateDebut, dateFin, client, chambre, status);
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        String req = "SELECT * FROM reservation";
        List<Reservation> reservations = new ArrayList<>();
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req); ResultSet rs = ps.executeQuery()) {

            ClientService clientService = new ClientService();
            ChambreService chambreService = new ChambreService();

            while (rs.next()) {
                int id = rs.getInt("id");
                Date dateDebut = rs.getDate("dateDebut");
                Date dateFin = rs.getDate("dateFin");

                Client client = null;

                if (rs.getObject("client_id") != null) {
                    client = clientService.findById(rs.getInt("client_id"));
                }
                Chambre chambre = null;

                if (rs.getObject("chambre_id") != null) {
                    chambre = chambreService.findById(rs.getInt("chambre_id"));
                }

                String statusString = rs.getString("status");
                ReservationStatus status = ReservationStatus.fromValue(statusString);

                Reservation reservation = new Reservation(id, dateDebut, dateFin, client, chambre, status);

                reservations.add(reservation);
            }

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return reservations;
    }

    public boolean updateStatus(int reservationId, ReservationStatus status) {
        String query = "UPDATE reservation SET status = ? WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(query)) {
            ps.setString(1, status.getValue());
            ps.setInt(2, reservationId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
