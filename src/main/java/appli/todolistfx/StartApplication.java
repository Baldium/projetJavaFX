package appli.todolistfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("loginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void changeScene(String viewAmettre) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource(viewAmettre));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        stage.setTitle(viewAmettre);
        stage.setScene(scene);
        stage.show();



    }



    public static void main(String[] args) {
        launch();
    }
}