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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class MenuController {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;
    @FXML
    void MenuExit(ActionEvent event) throws IOException {

        FileWriter fw = new FileWriter(DataFile.Income,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+DataFile.CustomerName+" "+DataFile.CutomerBill ;
        b.write(addData);
        b.close();
        fw.close();

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("LOGOUT");
        alert.setContentText("Successfully Log Out from the program");
        Optional<ButtonType> result = alert.showAndWait();
        Platform.exit();
        System.exit(0);
    }
    @FXML
   public void UserCart(ActionEvent event)throws IOException {

        root = FXMLLoader.load(getClass().getResource("/Cart.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("User Cart");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ProductsBtn(ActionEvent event) throws IOException{
        //kaj baki
        root = FXMLLoader.load(getClass().getResource("/ProductsMenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Product Menu");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ShopAdsBtn(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/ShoppingAds.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Shop Ads");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void UserInfoBtn(ActionEvent event) throws IOException{
        //kaj baki
        root = FXMLLoader.load(getClass().getResource("/UserInfo.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("User Info");
        stage.setScene(scene);
        stage.show();

    }
}
