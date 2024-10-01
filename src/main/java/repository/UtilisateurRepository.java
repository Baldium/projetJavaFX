package repository;
import java.sql.*;
import database.Database;

import model.Utilisateur;

public class UtilisateurRepository {

    public void inscription(String nom, String prenom, String email, String motDePasse) {
        Database db = new Database();
        Connection cnx = db.getConnection();
        try {
            PreparedStatement st = cnx.prepareStatement("INSERT INTO utilisateur (nom, prenom, email, motDePasse) VALUES (?, ?, ?, ?)");
            st.setString(1, nom);
            st.setString(2, prenom);
            st.setString(3, email);
            st.setString(4, motDePasse);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
