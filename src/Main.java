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

    static Stage stage;
    private static boolean pageSelection = true;

    public static void swap() throws Exception {
        Parent root;
        if(pageSelection){
            root = FXMLLoader.load(Main.class.getResource("OrderSummary.fxml"));
        }else{
            root = FXMLLoader.load(Main.class.getResource("SandwichShop.fxml"));
        }
        pageSelection = !pageSelection;
        stage.setScene(new Scene(root, 600, 600));
        stage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("SandwichShop.fxml"));
        primaryStage.setTitle("primaryStage");
        primaryStage.setScene(new Scene(root, 600, 600));
        stage = primaryStage;
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}