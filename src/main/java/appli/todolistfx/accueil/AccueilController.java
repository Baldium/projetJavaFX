package appli.todolistfx.accueil;

import appli.todolistfx.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import static appli.todolistfx.StartApplication.changeScene;

public class AccueilController {

    @FXML
    private Label accueilText;

    @FXML
    private Button inscriptionButton;

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
