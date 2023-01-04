package com.example.sportsshopmanagement;

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

public class JerseyController {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;
    @FXML
    void JerseyGoBack(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/ProductsMenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Product Menu");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void buyArgJersey(ActionEvent event) throws IOException {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Added Argentina Jersey to your cart");
        Optional<ButtonType> result = alert.showAndWait();

        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Argentina Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    void buyBDjersey(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Added Bangladesh Jersey to your cart");
        Optional<ButtonType> result = alert.showAndWait();
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"BD Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    void buyBarcaJersey(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Added Barcelona Jersey to your cart");
        Optional<ButtonType> result = alert.showAndWait();
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Barcelona Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    void buyIndJersey(ActionEvent event)throws IOException  {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Added India Jersey to your cart");
        Optional<ButtonType> result = alert.showAndWait();
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Ind Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    void buyPakJersey(ActionEvent event)throws IOException  {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Added Pakistan Jersey to your cart");
        Optional<ButtonType> result = alert.showAndWait();
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Pakistan Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    void buyPsgJersey(ActionEvent event)throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Added PSG Jersey to your cart");
        Optional<ButtonType> result = alert.showAndWait();
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"PSG Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }
}
