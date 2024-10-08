package repository;
import java.io.IOException;
import java.sql.*;
import database.Database;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import model.Utilisateur;

import static appli.todolistfx.StartApplication.changeScene;

public class UtilisateurRepository {


    public void inscription(String nom, String prenom, String email, String motDePasse) {
        Database db = new Database();
        Connection cnx = db.getConnection();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String motDePassehash = encoder.encode(motDePasse);

        try {
            PreparedStatement st = cnx.prepareStatement("INSERT INTO utilisateur (nom, prenom, email, mot_de_passe) VALUES (?, ?, ?, ?)");
            st.setString(1, nom);
            st.setString(2, prenom);
            st.setString(3, email);
            st.setString(4, motDePassehash);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean connexion(String email, String motDePasse) {
        Database db = new Database();
        Connection cnx = db.getConnection();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        try {
            PreparedStatement st = cnx.prepareStatement("SELECT * FROM utilisateur WHERE email = ?");
            st.setString(1, email);
            ResultSet rs = st.executeQuery();

            if (rs.next() == true){
                return encoder.matches(motDePasse, rs.getString("mot_de_passe"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}