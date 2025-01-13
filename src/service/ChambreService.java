package service;

import connexion.Connexion;
import dao.IDAO;
import entities.Categorie;
import entities.Chambre;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChambreService implements IDAO<Chambre> {

    @Override
    public boolean creat(Chambre o) {
        if (o == null || o.getCategorie() == null) {
            System.out.println("Chambre or Categorie is null");
            return false;
        }

        String req = "INSERT INTO chambre (numero, telephone, categorie_id) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getNumero());
            ps.setString(2, o.getTelephone());
            ps.setInt(3, o.getCategorie().getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Chambre o) {
        String req = "UPDATE chambre SET numero = ?, telephone = ?, categorie_id = ? WHERE id = ?";

        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {

            ps.setString(1, o.getNumero());
            ps.setString(2, o.getTelephone());

            if (o.getCategorie() != null) {
                ps.setInt(3, o.getCategorie().getId());
            } else {
                ps.setNull(3, java.sql.Types.INTEGER); // Mettre NULL si la catégorie est null
            }

            ps.setInt(4, o.getId());

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(Chambre o) {
        if (o == null) {
            throw new IllegalArgumentException("La chambre est nul !");
        }
        String req = "DELETE FROM chambre WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("Erreur lors de la suppression du chambre avec ID " + o.getId() + " : " + e.getMessage());
        }
        return false;
    }

    @Override
    public Chambre findById(int id) {
        String req = "SELECT * FROM chambre WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String numero = rs.getString("numero");
                String telephone = rs.getString("telephone");

                int categorieId = rs.getInt("categorie_id");
                Categorie categorie = new CategorieService().findById(categorieId);

                // Créer et retourner l'objet Chambre
                return new Chambre(id, numero, telephone, categorie);
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Chambre> findAll() {
        String req = "SELECT id, numero, telephone, categorie_id FROM chambre";
        List<Chambre> chambres = new ArrayList<>();
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String numero = rs.getString("numero");
                String telephone = rs.getString("telephone");

                Categorie categorie = new CategorieService().findById(rs.getInt("categorie_id"));

                chambres.add(new Chambre(id, numero, telephone, categorie));
            }
            return chambres;

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return null;
    }

    public boolean isNumeroExist(String numero, int excludeId) {
        String req = "SELECT COUNT(*) FROM chambre WHERE numero = ? AND id != ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, numero);
            ps.setInt(2, excludeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // Le numero existe déjà
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false; // Le numero n'existe pas
    }

    public boolean isPhoneExist(String phone, int excludeId) {
        String req = "SELECT COUNT(*) FROM chambre WHERE telephone = ? AND id != ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, phone);
            ps.setInt(2, excludeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // Le telephone existe déjà
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false; // Le telephone n'existe pas
    }

}
