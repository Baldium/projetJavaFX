package appli.todolistfx.accueil;

import appli.todolistfx.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Liste;
import repository.ListeRepository;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static appli.todolistfx.StartApplication.changeScene;

public class AccueilController implements Initializable {

    @FXML
    private Button deconbutton;

    @FXML
    void deconnexion(ActionEvent event) {

        try {
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            StartApplication.changeScene("loginView.fxml", currentStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private TableView<Liste> Tableauliste;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[][] colonnes = {
                {"Id Liste", "idListe" },
                {"Nom", "nom" },
        };
        //parcours de l'ensemble de nos colonnes
        for (int i = 0; i < colonnes.length; i++) {
            //creation de la colonne avec le titre
            TableColumn<Liste, String> maColonne = new TableColumn<>(colonnes[i][0]);
            //ligne permettant la liaison automatique de la cellule avec la propriété donnée
            maColonne.setCellValueFactory(new PropertyValueFactory<>(colonnes[i][1]));
            //Ajout de la colonne a notre tableau
            Tableauliste.getColumns().add(maColonne);

        }

    }
}

