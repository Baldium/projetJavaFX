package repository;
import java.io.IOException;
import java.sql.*;
import database.Database;

import model.Utilisateur;

import static appli.todolistfx.StartApplication.changeScene;

public class UtilisateurRepository {

    public void inscription(String nom, String prenom, String email, String motDePasse) {
        Database db = new Database();
        Connection cnx = db.getConnection();
        try {
            PreparedStatement st = cnx.prepareStatement("INSERT INTO utilisateur (nom, prenom, email, mot_de_passe) VALUES (?, ?, ?, ?)");
            st.setString(1, nom);
            st.setString(2, prenom);
            st.setString(3, email);
            st.setString(4, motDePasse);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean connexion(String email, String motDePasse) {
        Database db = new Database();
        Connection cnx = db.getConnection();
        try {
            PreparedStatement st = cnx.prepareStatement("SELECT * FROM utilisateur WHERE email = ? AND mot_de_passe = ?");
            st.setString(1, email);
            st.setString(2, motDePasse);
            ResultSet rs = st.executeQuery();
            if (rs.next() == true){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}