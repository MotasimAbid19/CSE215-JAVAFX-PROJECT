package com.example.sportsshopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SellerLoginController {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;
    @FXML
    private Label sellerLabel;

    @FXML
    private PasswordField sellerPassword;

    @FXML
    private TextField sellerUserName;

    @FXML
    void sellerLogin(ActionEvent event) throws IOException {
        if(sellerUserName.getText()==""){
            sellerLabel.setText("Username field cannot be empty");
        }
        else if(sellerPassword.getText()==""){
            sellerLabel.setText("Password field cannot be empty");
        }
        else{
            root = FXMLLoader.load(getClass().getResource("/SellerMenu.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("LOGIN PAGE");
            stage.setScene(scene);
            stage.show();
        }


    }

}
