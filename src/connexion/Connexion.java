package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    private static final String url = "jdbc:mysql://localhost:3306/gestion_reservation";
    private static final String user = "root";
    private static final String password = "";
    private static Connection con = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Pilote chargé");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion OK");
        } catch (SQLException e) {
            System.out.println("Erreur connexion");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur chargement de pilote");
        }
    }

    public static Connection getConnection() {
        return con;
    }
}
