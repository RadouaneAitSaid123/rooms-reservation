/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import connexion.Connexion;
import entities.Client;
import entities.ModelLogin;
import entities.ModelUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {

    private final Connection con;

    // Utilisation de la connexion existante
    public UserService() {
        this.con = (Connection) Connexion.getConnection(); // Récupère la connexion à partir de la classe Connexion
        if (con == null) {
            throw new IllegalStateException("La connexion à la base de données n'a pas été initialisée.");
        }
    }

    public ModelUser login(ModelLogin login) throws SQLException {
        ModelUser data = null;
        String req = "SELECT UserId, UserName, Email FROM `user` WHERE BINARY(Email)=? AND BINARY(`Password`)=? AND `Status`='Verified' LIMIT 1";
        try (PreparedStatement p = Connexion.getConnection().prepareStatement(req, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            p.setString(1, login.getEmail());
            p.setString(2, login.getPassword());
            ResultSet r = p.executeQuery();

            if (r.first()) {
                int userID = r.getInt(1);
                String userName = r.getString(2);
                String email = r.getString(3);
                data = new ModelUser(userID, userName, email, "");
            }
            r.close();
            p.close();
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
// Ajouter un utilisateur dans la base de données

    public void insertUser(ModelUser user) {
        String req = "INSERT INTO `user` (UserName, Email, `Password`, VerifyCode) VALUES (?, ?, ?, ?)";
        try (PreparedStatement p = Connexion.getConnection().prepareStatement(req, PreparedStatement.RETURN_GENERATED_KEYS)) {
            String code = generateVerifyCode();
            p.setString(1, user.getUserName());
            p.setString(2, user.getEmail());
            p.setString(3, user.getPassword());
            p.setString(4, code);
            p.executeUpdate();

            try (ResultSet r = p.getGeneratedKeys()) {
                if (r.next()) {
                    int userID = r.getInt(1);
                    user.setUserID(userID);
                    user.setVerifyCode(code);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Générer un code de vérification unique
    private String generateVerifyCode() throws SQLException {
        DecimalFormat df = new DecimalFormat("000000");
        Random random = new Random();
        String code;
        do {
            code = df.format(random.nextInt(1000000)); // Génère un code aléatoire entre 000000 et 999999
        } while (checkDuplicateCode(code));
        return code;
    }

    // Vérifier si le code de vérification est déjà utilisé
    private boolean checkDuplicateCode(String code) throws SQLException {
        String sql = "SELECT UserID FROM `user` WHERE VerifyCode=? LIMIT 1";
        try (PreparedStatement p = Connexion.getConnection().prepareStatement(sql)) {
            p.setString(1, code);
            try (ResultSet r = p.executeQuery()) {
                return r.next();
            }
        }
    }

    // Vérifier si le nom d'utilisateur est déjà utilisé
    public boolean checkDuplicateUser(String username) throws SQLException {
        String sql = "SELECT UserID FROM `user` WHERE UserName=? AND `Status`='Verified' LIMIT 1";
        try (PreparedStatement p = Connexion.getConnection().prepareStatement(sql)) {
            p.setString(1, username);
            try (ResultSet r = p.executeQuery()) {
                return r.next();
            }
        }
    }

    // Vérifier si l'email est déjà utilisé
    public boolean checkDuplicateEmail(String email) throws SQLException {
        String sql = "SELECT UserID FROM `user` WHERE Email=? AND `Status`='Verified' LIMIT 1";
        try (PreparedStatement p = Connexion.getConnection().prepareStatement(sql)) {
            p.setString(1, email);
            try (ResultSet r = p.executeQuery()) {
                return r.next();
            }
        }
    }

    // Marquer un utilisateur comme vérifié
    public void doneVerify(int userID) throws SQLException {
        String sql = "UPDATE `user` SET VerifyCode='', `Status`='Verified' WHERE UserID=? LIMIT 1";
        try (PreparedStatement p = Connexion.getConnection().prepareStatement(sql)) {
            p.setInt(1, userID);
            p.executeUpdate();
        }
    }

    // Vérifier un code de vérification avec un utilisateur donné
    public boolean verifyCodeWithUser(int userID, String code) throws SQLException {
        String sql = "SELECT UserID FROM `user` WHERE UserID=? AND VerifyCode=? LIMIT 1";
        try (PreparedStatement p = Connexion.getConnection().prepareStatement(sql)) {
            p.setInt(1, userID);
            p.setString(2, code);
            try (ResultSet r = p.executeQuery()) {
                return r.next();
            }
        }
    }

    public Iterable<ModelUser> findAll() {
        List<ModelUser> users = new ArrayList<>();
        String req = "SELECT * FROM user";
        try (PreparedStatement ps = Connexion.getConnection().prepareStatement(req); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ModelUser user = new ModelUser(
                        rs.getInt("UserId"),
                        rs.getString("UserName"),
                        rs.getString("Email"),
                        rs.getString("Password"),
                        rs.getString("VerifyCode"),
                        rs.getString("Status")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la récupération de tous les clients : " + e.getMessage());
        }
        return users;
    }

}
