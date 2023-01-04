package com.example.sportsshopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CartController implements Initializable {
    @FXML
    private Label CartLabel;
    @FXML
    private Label totalbill;
    @FXML
    private TextArea textfileAreaofCart;


    private Stage stage ;
    private Scene scene ;
    private Parent root ;

    @FXML
    private TextField cartItemName;

    @FXML
    void getCartText(MouseEvent event) throws IOException{

        Scanner sc = new Scanner(DataFile.tempFIle);
        ArrayList<String> str = new ArrayList<>();


        while (sc.hasNext()){
            str.add(sc.nextLine()) ;
        }

        String listString = " ";

        for (String s : str)
        {
            listString += s + "\n";
        }


        CartLabel.setText(listString);





    }

    @FXML
    void goBackToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void submitCart(ActionEvent event) throws  IOException{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Submitted your choice");
        Optional<ButtonType> result = alert.showAndWait();

        int bill = DataFile.CutomerBill ;

       String itemname = cartItemName.getText();


         Scanner sc = new Scanner(DataFile.tempFIle);
        ArrayList<String> str = new ArrayList<>();


        while (sc.hasNext()){
            str.add(sc.nextLine()) ;
        }


        for (int i = 0; i < str.size(); i++) {
            if(str.get(i).contains(itemname)) {
                if(str.get(i).contains("Barcelona Jersey = 1000")){
                    bill = bill - 1000 ;
                }
                str.remove(i);
            }
        }

        String listString = " ";

        for (String s : str)
        {
            listString += s + "\n";
        }


        CartLabel.setText(listString);


        String totalMoney = bill+"" ;

        totalbill.setText(totalMoney);


        //file e save korte hbe ------jate store thake.........


        for (String s : str)
        {
            FileWriter fw = new FileWriter(DataFile.tempFIle);
            BufferedWriter b = new BufferedWriter(fw);
            String addData = s+"\n";
            b.write(addData);
            b.close();
            fw.close();

        }





    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String str = DataFile.CutomerBill+" ";


        totalbill.setText(str);

    }
}