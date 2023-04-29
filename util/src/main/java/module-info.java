module com.example.util {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.util to javafx.fxml;
    exports com.example.util;
}