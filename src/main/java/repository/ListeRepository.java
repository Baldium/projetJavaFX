package repository;

import database.Database;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListeRepository {

    public void ajoutNom(String nom) {
        Database db = new Database();
        Connection cnx = db.getConnection();

        try {
            PreparedStatement st = cnx.prepareStatement("INSERT INTO liste (nom) VALUES (?)");
            st.setString(1, nom);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
