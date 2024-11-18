package appli.todolistfx.accueil;

import appli.todolistfx.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import repository.ListeRepository;

import java.io.IOException;

public class AjouterListeController {


    @FXML
    private TextField listeField;



    @FXML
    void ajouterListe(ActionEvent event) {
        try {
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            StartApplication.changeScene("accueilView.fxml", currentStage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ListeRepository liste = new ListeRepository();
        liste.ajoutNom(listeField.getText());





    }





}
