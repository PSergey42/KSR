module com.example.ksr {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jdk.jsobject;

    opens com.example.ksr to javafx.fxml;
    exports com.example.ksr;
}