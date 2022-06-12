module com.example.javafxapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.toba.javafxapplication to javafx.fxml;
    exports com.toba.javafxapplication;
}