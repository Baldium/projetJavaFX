package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String serveur = "localhost";
    private String nomDeLaBase = "projetjavafx";
    private String utilisateur = "root";
    private String motDePasse = "";

    public String getUrl() {
        return "jdbc:mysql://"+serveur+":3306/"+nomDeLaBase+"?serverTimezone=UTC";
    }

    public Connection getConnection() {
        try {
            Connection cnx = DriverManager.getConnection(this.getUrl(), this.utilisateur, this.motDePasse);
            System.out.println("Etat de la connexion : ");
            System.out.println(cnx.isClosed() ? "Fermée" : "Ouverte \r\n");
            return cnx;
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données");
            e.printStackTrace();
            return null;
        }

    }
}