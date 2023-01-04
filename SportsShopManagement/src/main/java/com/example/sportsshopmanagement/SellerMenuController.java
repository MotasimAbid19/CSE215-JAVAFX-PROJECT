package com.example.sportsshopmanagement;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class SellerMenuController {

    private Stage stage ;
    private Scene scene ;
    private Parent root ;

    @FXML
    void SellerCustomerShowBtn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/SellerCustomerListView.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("LOGIN PAGE");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void sellerBillShow(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/SellerIncome.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("LOGIN PAGE");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void sellerExit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGOUT");
        alert.setContentText("Successfully Log Out from the program");
        Optional<ButtonType> result = alert.showAndWait();
        Platform.exit();
        System.exit(0);

    }

}
