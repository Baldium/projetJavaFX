package appli.todolistfx.accueil;


import appli.todolistfx.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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

    static void changeScene(String viewAmettre) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource(viewAmettre));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        stage.setTitle(viewAmettre);
        stage.setScene(scene);
        stage.show();



    }

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
        System.out.println("Connexion");
    }

    @FXML
    void inscription(ActionEvent event) {
       try {
           changeScene("inscriptionView.fxml");
       } catch (IOException e) {
           e.printStackTrace();
       }

    }

    @FXML
    void mdpOublie(ActionEvent event) {
        System.out.println("Mot de passe oublié");
    }

}
