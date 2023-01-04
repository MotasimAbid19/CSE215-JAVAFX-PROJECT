package com.example.sportsshopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class ShopAdsController {

    private Stage stage ;
    private Scene scene ;
    private Parent root ;




    @FXML
    private ImageView AdsImage;

    @FXML
    private Button button3;

    @FXML
    private Button view1;

    @FXML
    private Button view2;

    @FXML
    private Button view4;

    @FXML
    void GoBackToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ViewBtn1(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alert");
        alert.setContentText("new Ads are coming");
        Optional<ButtonType> result = alert.showAndWait();

    }

    @FXML
    void ViewBtn2(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alert");
        alert.setContentText("new Ads are coming");
        Optional<ButtonType> result = alert.showAndWait();

    }

    @FXML
    void ViewBtn3(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alert");
        alert.setContentText("new Ads are coming");
        Optional<ButtonType> result = alert.showAndWait();

    }

    @FXML
    void ViewBtn4(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alert");
        alert.setContentText("new Ads are coming");
        Optional<ButtonType> result = alert.showAndWait();

    }

    @FXML
    void viewButton3(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alert");
        alert.setContentText("new Ads are coming");
        Optional<ButtonType> result = alert.showAndWait();

    }

}
