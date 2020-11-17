/**
@author Devin Gulati, Emily Tronolone
*/

//package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("SandwichShop.fxml"));
        primaryStage.setTitle("primaryStage");
        primaryStage.setScene(new Scene(root, 600, 600));
        Stage stage = primaryStage;
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}