package com.example.sportsshopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SellerCustomerListView {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;

    @FXML
    private Label customerListLabel;

    @FXML
    void GoBack(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/SellerMenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("LOGIN PAGE");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void sellerCustomerView(ActionEvent event) throws IOException {

        Scanner sc = new Scanner(DataFile.UserLogin);
        ArrayList<String> arr = new ArrayList<>();

        while ( sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();

            arr.add(str1);
        }
        String listString = " ";

        for (String s : arr)
        {
            listString += s + "\n";
        }

        customerListLabel.setText(listString);

    }

}
