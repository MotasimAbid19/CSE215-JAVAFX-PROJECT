package com.example.sportsshopmanagement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductMenuController {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;
    @FXML
    void JerseyBtn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Jersey.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Jersey");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ProductMenuExit(ActionEvent event)throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void cricketBtn(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/Football.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Cricket");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void footballBtn(ActionEvent event)throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Cricket.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Football");
        stage.setScene(scene);
        stage.show();

    }
}
