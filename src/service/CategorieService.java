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
        return false;
    }

    @Override
    public boolean delete(Categorie o) {
        return false;
    }

    @Override
    public Categorie findById(int id) {
        String req = "select * from categorie where categorie_id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Categorie(rs.getInt(1), rs.getString("code"), rs.getString("libelle"));
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
}
