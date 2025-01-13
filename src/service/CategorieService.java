package service;

import connexion.Connexion;
import dao.IDAO;
import entities.Categorie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategorieService implements IDAO<Categorie> {

    @Override
    public boolean creat(Categorie o) {
        String req = "insert into categorie (code, libelle) values(?,?)";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getCode());
            ps.setString(2, o.getLibelle());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erreur sql");
        }
        return false;
    }

    @Override
    public boolean update(Categorie o) {
        String req = "UPDATE categorie SET code = ?, libelle = ? WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setString(1, o.getCode());
            ps.setString(2, o.getLibelle());
            ps.setInt(3, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("Erreur lors de la mise à jour du catégorie avec ID " + o.getId() + " : " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Categorie o) {
        if (o == null) {
            throw new IllegalArgumentException("La cetégorie est nul !");
        }
        String req = "DELETE FROM categorie WHERE id = ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("Erreur lors de la suppression du catégorie avec ID " + o.getId() + " : " + e.getMessage());
        }
        return false;
    }

    @Override
    public Categorie findById(int id) {
        String req = "select * from categorie where id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Categorie cat = new Categorie();
                cat.setId(rs.getInt("id"));
                cat.setCode(rs.getString("code"));
                cat.setLibelle(rs.getString("libelle"));
                return cat;
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        }
        return null;
    }

    public Categorie findByLibelle(String libelle) {
        String req = "select * from categorie where libelle = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, libelle);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Categorie cat = new Categorie();
                cat.setId(rs.getInt("id"));
                cat.setCode(rs.getString("code"));
                cat.setLibelle(rs.getString("libelle"));
                return cat;
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        }
        return null;
    }

    @Override
    public List<Categorie> findAll() {
        String req = "select * from categorie";
        List<Categorie> categories = new ArrayList<>();
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                categories.add(new Categorie(rs.getInt(1), rs.getString("code"), rs.getString("libelle")));
            }
            return categories;
        } catch (SQLException e) {
            System.out.println("Erreur findAll SQL");
        }
        return null;
    }

    public boolean isCodeExist(String code, int excludeId) {
        String req = "SELECT COUNT(*) FROM categorie WHERE code = ? AND id != ?";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req)) {
            ps.setString(1, code);
            ps.setInt(2, excludeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // Le code existe déjà, mais pas pour cette catégorie
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false; // Le code n'existe pas ou appartient à la même catégorie
    }

    public boolean isLibelleExist(String libelle, int excludeId) {
        String req = "SELECT COUNT(*) FROM categorie WHERE libelle = ? AND id != ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, libelle);
            ps.setInt(2, excludeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // Le libelle existe déjà
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        }
        return false; // Le libelle n'existe pas
    }
}
