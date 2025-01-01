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

        String req = "INSERT INTO chambre (telephone, categorie_id) VALUES (?, ?)";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getTelephone());
            ps.setInt(2, o.getCategorie().getId());
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
        return false;
    }

    @Override
    public boolean delete(Chambre o) {
        return false;
    }

    @Override
    public Chambre findById(int id) {
        String req = "select * from chambre where id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Categorie categorie = new CategorieService().findById(rs.getInt("categorie_id"));
                return new Chambre(rs.getString("telephone"), categorie);
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        }
        return null;
    }

    @Override
    public List<Chambre> findAll() {
        String req = "select * from chambre";
        List<Chambre> chambres = new ArrayList<>();
        try{
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Categorie categorie = new CategorieService().findById(rs.getInt("categorie_id"));
                chambres.add(new Chambre(rs.getString("telephone"), categorie));
            }
            return chambres;
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        }
        return null;
    }
}
