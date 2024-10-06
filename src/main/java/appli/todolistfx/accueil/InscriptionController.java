package appli.todolistfx.accueil;
import appli.todolistfx.StartApplication;
import javafx.scene.Node;
import javafx.stage.Stage;
import repository.UtilisateurRepository;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import static appli.todolistfx.StartApplication.changeScene;

public class InscriptionController {

    @FXML
    private PasswordField confirmerMdpField;

    @FXML
    private TextField emailField;

    @FXML
    private Button inscriptionButton;

    @FXML
    private PasswordField mdpField;

    @FXML
    private TextField nomField;

    @FXML
    private TextField prenomField;

    @FXML
    private Button returnButton;

    @FXML
    private Label affichertext;

    @FXML
    void insConfirmerMdp(ActionEvent event) {

    }

    @FXML
    void insMail(ActionEvent event) {

    }

    @FXML
    void insMdp(ActionEvent event) {

    }

    @FXML
    void insNom(ActionEvent event) {

    }

    @FXML
    void insPrenom(ActionEvent event) {

    }

    @FXML
    void inscription(ActionEvent event) {
        UtilisateurRepository inscrire = new UtilisateurRepository();
        if (mdpField.getText().equals(confirmerMdpField.getText())) {
            inscrire.inscription(nomField.getText(), prenomField.getText(), emailField.getText(), mdpField.getText());
            affichertext.setText("inscription reussi");

        }
        else {
            affichertext.setText("Les mots de passe ne correspondent pas");
        }
    }

    @FXML
    void retour(ActionEvent event) {
        try {
            Stage currentStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            StartApplication.changeScene("loginView.fxml", currentStage);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
