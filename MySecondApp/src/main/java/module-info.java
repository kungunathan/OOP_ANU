module com.example.mysecondapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.mysecondapp to javafx.fxml;
    exports com.example.mysecondapp;
}