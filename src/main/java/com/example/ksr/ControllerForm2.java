package com.example.ksr;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.IOException;
import java.net.MalformedURLException;

public class ControllerForm2 extends Window {

    private static Button buttonObr;

    public static void setBobr(Button bobr){
        buttonObr = bobr;
    }

    @FXML
    private ProgressBar progressBar;
    double value = 0;

    @FXML
    void initialize()  {
        KeyFrame keyEvent = new KeyFrame(Duration.seconds(0.5),event -> {
            progressBar.progressProperty().set(value+=0.04);
            if(value > 1) {
                Stage stage = (Stage)progressBar.getScene().getWindow();
                stage.close();}
        });
        Timeline timeline = new Timeline(keyEvent);
        timeline.setCycleCount(25);
        timeline.play();
    }

}
