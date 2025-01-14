package service;

import connexion.Connexion;
import dao.IDAO;
import entities.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientService implements IDAO<Client> {

    @Override
    public boolean creat(Client o) {
        String req = "INSERT INTO client (nom, prenom, telephone, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getTelephone());
            ps.setString(4, o.getEmail());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("Erreur lors de la création du client : " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Client o) {
        String req = "UPDATE client SET nom = ?, prenom = ?, email = ?, telephone = ? WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getEmail());
            ps.setString(4, o.getTelephone());
            ps.setInt(5, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("Erreur lors de la mise à jour du client avec ID " + o.getId() + " : " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Client o) {
        if (o == null) {
            throw new IllegalArgumentException("Le client est nul !");
        }
        String req = "DELETE FROM client WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("Erreur lors de la suppression du client avec ID " + o.getId() + " : " + e.getMessage());
        }
        return false;
    }

    @Override
    public Client findById(int id) {
        String req = "SELECT * FROM client WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String phone = rs.getString("telephone");
                String email = rs.getString("email");
                return new Client(id, nom, prenom, phone, email);
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de la recherche du client avec ID " + id + " : " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients = new ArrayList<>();
        String req = "SELECT * FROM client";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Client client = new Client(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("telephone"),
                        rs.getString("email")
                );
                clients.add(client);
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la récupération de tous les clients : " + e.getMessage());
        }
        return clients;
    }

    public boolean isEmailExist(String email, int excludeId) {
        String req = "SELECT COUNT(*) FROM client WHERE email = ? AND id != ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, email);
            ps.setInt(2, excludeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // L'email existe déjà
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false; // L'email n'existe pas
    }

    public boolean isPhoneExist(String telephone, int excludeId) {
        String req = "SELECT COUNT(*) FROM client WHERE telephone = ? AND id != ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, telephone);
            ps.setInt(2, excludeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // Le téléphone existe déjà
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false; // Le téléphone n'existe pas
    }

    public Client findByName(String clientName) {
        String req = "SELECT * FROM client WHERE nom = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setString(1, clientName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String prenom = rs.getString("prenom");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");

                return new Client(id, clientName, prenom, telephone, email);
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return null;
    }

    public Client findByPrenom(String clientPrenom) {
         String req = "SELECT * FROM client WHERE prenom = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setString(1, clientPrenom);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");

                return new Client(id, nom, clientPrenom, telephone, email);
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return null;
    }

}
