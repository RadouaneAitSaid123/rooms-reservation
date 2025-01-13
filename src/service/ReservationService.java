package service;

import connexion.Connexion;
import dao.IDAO;
import entities.Categorie;
import entities.Chambre;
import entities.Client;
import entities.Reservation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService implements IDAO<Reservation> {

    @Override
    public boolean creat(Reservation o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Reservation o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Reservation o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Reservation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Reservation> findAll() {
        String req = "SELECT id, dateDebut, dateFin, client_id, chambre_id FROM reservation";
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

                if (rs.getObject("chambre") != null) {
                    chambre = chambreService.findById(rs.getInt("chambre"));
                }

                Reservation reservation = new Reservation(id, dateDebut, dateFin, client, chambre);

                reservations.add(reservation);
            }

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return reservations;
    }

}
