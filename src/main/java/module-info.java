module com.example.ksr {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jdk.jsobject;
    requires com.fasterxml.jackson.databind;

    opens com.example.ksr to javafx.fxml;
    exports com.example.ksr.pollutions;
    exports com.example.ksr;
}