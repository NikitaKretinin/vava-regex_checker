package sk.vava.zalospevaci;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("checker.fxml"));
        stage.setTitle("RegEx checker");
        stage.setScene(new Scene(root, 792, 504));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}