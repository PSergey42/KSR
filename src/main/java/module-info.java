module com.example.ksr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ksr to javafx.fxml;
    exports com.example.ksr;
}