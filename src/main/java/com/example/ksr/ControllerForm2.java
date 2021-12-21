package com.example.ksr;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.IOException;
import java.net.MalformedURLException;

public class ControllerForm2 extends Window {

    private static Button buttonObr;

    private static ToggleButton buttonDiagram;
    private static ToggleButton buttonList;
    private static Label lable1;
    private static ListView<?> list2;
    private static Label statusAir;
    private static Label statusValue;
    private static ScrollPane scrollPane;
    private static BarChart<String, Double> chartPollutants;

    public static void setFulData(FullData data){
        ControllerForm2.data = data;
    }

    public static void setStatus(Label statusAir, Label statusValue, Label lable1, ListView<?> list2, ScrollPane scrollPane, BarChart<String, Double> chartPollutants,
                                 ToggleButton buttonDiagram,ToggleButton buttonList){
        ControllerForm2.statusAir = statusAir;
        ControllerForm2.statusValue = statusValue;
        ControllerForm2.lable1 = lable1;
        ControllerForm2.list2 = list2;
        ControllerForm2.scrollPane = scrollPane;
        ControllerForm2.chartPollutants = chartPollutants;
        ControllerForm2.buttonDiagram = buttonDiagram;
        ControllerForm2.buttonList = buttonList;

    }


    @FXML
    private ProgressBar progressBar;
    double value = 0;

    @FXML
    void initialize()  {
        KeyFrame keyEvent = new KeyFrame(Duration.seconds(0.1),event -> {
            progressBar.progressProperty().set(value+=0.04);
            if(value > 1.04) {
                Stage stage = (Stage)progressBar.getScene().getWindow();
                stage.close();
                statusAir.setVisible(true);
                statusValue.setVisible(true);
                scrollPane.setVisible(true);
                lable1.setVisible(true);
                list2.setVisible(true);
                buttonDiagram.setVisible(true);
                buttonList.setVisible(true);
                //chartPollutants.setVisible(true);
                statusAir.setText(data.getData().getIndexes().getBaqi().getCategory());
                statusValue.setText(data.getData().getIndexes().getBaqi().getAqiDisplay());
            }
        });
        Timeline timeline = new Timeline(keyEvent);
        timeline.setCycleCount(26);
        timeline.play();
    }



}
