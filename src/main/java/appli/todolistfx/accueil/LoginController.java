package appli.todolistfx.accueil;


import appli.todolistfx.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import repository.UtilisateurRepository;

import java.io.IOException;

import static appli.todolistfx.StartApplication.changeScene;

public class LoginController {

    @FXML
    private TextField email;

    @FXML
    private PasswordField motDePasse;

    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText1;

    @FXML
    private Label welcomeText11;



    @FXML
    void affichermail(ActionEvent event) {
        System.out.println(email.getText());
    }

    @FXML
    void affichermdp(ActionEvent event) {
        System.out.println(motDePasse.getText());

    }

    @FXML
    void connexion(ActionEvent event) {

        UtilisateurRepository connexion = new UtilisateurRepository();

        if (connexion.connexion(email.getText(), motDePasse.getText()) == true) {
            try {
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                StartApplication.changeScene("accueilView.fxml", currentStage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            welcomeText.setText("Email ou mot de passe incorrect");
        }
    }

    @FXML
    void inscription(ActionEvent event) {
        try {
            Stage currentStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            StartApplication.changeScene("inscriptionView.fxml", currentStage);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void mdpOublie(ActionEvent event) {
        System.out.println("Mot de passe oublié");
    }

}
