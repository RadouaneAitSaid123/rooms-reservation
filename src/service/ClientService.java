package service;

import com.mysql.cj.xdevapi.Result;
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
        String req = "insert into client (nom, prenom, telephone, email) values(?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getTelephone());
            ps.setString(4, o.getEmail());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erreur sql");
        }
        return false;
    }

    @Override
    public boolean update(Client o) {
        String req = "UPDATE client SET nom = ?, prenom = ?, email = ?, telephone = ? WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getEmail());
            ps.setString(4, o.getTelephone());
            ps.setInt(5, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Client o) {
        String req = "DELETE FROM client WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        }
        return false;
    }

    @Override
    public Client findById(int id) {
        String req = "SELECT * FROM client WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Client(rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        }
        return null;
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients = new ArrayList<>();
        String req = "SELECT * FROM client";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clients.add(new Client(rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email")));
            }
            return clients;
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        }
        return null;
    }


}
