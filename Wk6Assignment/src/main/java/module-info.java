module com.example.wk6assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.wk6assignment to javafx.fxml;
    exports com.example.wk6assignment;
}