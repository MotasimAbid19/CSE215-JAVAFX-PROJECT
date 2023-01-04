module com.example.sportsshopmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sportsshopmanagement to javafx.fxml;
    exports com.example.sportsshopmanagement;
}