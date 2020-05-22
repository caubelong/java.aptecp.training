package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Navigator.getInstance().setStage(primaryStage);
//        Navigator.getInstance().goToIndexSubject();
//        Navigator.getInstance().getStage().show();

        Navigator.getInstance().setStage(primaryStage);
        Navigator.getInstance().goToIndexTeacher();
        Navigator.getInstance().getStage().show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
