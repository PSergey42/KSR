package com.example.ksr;

import com.example.ksr.pollutions.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class HelloController{

    @FXML
    private ToggleButton buttonDiagram;

    @FXML
    private ToggleButton buttonList;

    @FXML
    private Button buttonObr;

    @FXML
    private WebView webViewMap;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane panel;

    @FXML
    private Label statusAir;

    @FXML
    private Label statusValue;

    @FXML
    private Label lable1;

    @FXML
    private ListView<String> list1;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private BarChart<String, Double> chartPollutants;

    private static FullData data;

    @FXML
    void initialize() throws MalformedURLException {
        buttonDiagram.setVisible(false);
        buttonList.setVisible(false);
        chartPollutants.setVisible(false);
        statusAir.setVisible(false);
        statusValue.setVisible(false);
        lable1.setVisible(false);
        scrollPane.setVisible(false);
        list1.setVisible(false);
        panel.setVisible(false);
        GoogleMap googleMap = new GoogleMap(webViewMap);
        GoogleMap.setHelloController(this);
        ControllerForm2.setStatus(statusAir,statusValue,lable1,list1,scrollPane, chartPollutants,buttonDiagram,buttonList);
    }

    @FXML
    public void clickObr() throws IOException {
        buttonObr.setVisible(false);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dopView.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 386, 109);
        Stage newWindow = new Stage();
        newWindow.setTitle("??????????????????");
        newWindow.setScene(secondScene);
        newWindow.setResizable(false);
        newWindow.initModality(Modality.APPLICATION_MODAL);
        chartPollutants.getData().clear();
        list1.getItems().clear();
        XYChart.Series<String, Double> series = new XYChart.Series<>();
        series.setName("????????????????????????");
        for (Map.Entry<String, Substance> pollutant: data.getData().getPollutants().entrySet()) {
            String s = String.format("%.2f %s",
                    pollutant.getValue().getConcentration().getValue(), pollutant.getValue().getConcentration().getType());
            while (!s.matches(".{13}")){
                s = " " + s;
            }
            String str = pollutant.getValue().getDisplayName();
            while (!str.matches(".{5}")){
                str += " ";
            }

            list1.getItems().add(String.format("%s                            %s", str, s));
            series.getData().add(new XYChart.Data<String, Double>(
                    pollutant.getKey(),
                    FullData.convert(pollutant.getValue())
                    ));
        }
        chartPollutants.getData().add(series);
        newWindow.showAndWait();
    }

    public void paneIsVisible(){
        panel.setVisible(true);
        buttonDiagram.setVisible(false);
        buttonList.setVisible(false);
        lable1.setVisible(false);
        scrollPane.setVisible(false);
        chartPollutants.setVisible(false);
        list1.setVisible(false);
        statusAir.setVisible(false);
        statusValue.setVisible(false);
        buttonObr.setVisible(true);
    }

    public static void setFulData(FullData data){
        HelloController.data = data;
    }

    @FXML
    public void click1(){
        lable1.setText(data.getData().getHealthRecommendations().getGeneralPopulation());
    }

    @FXML
    public void click2(){
        lable1.setText(data.getData().getHealthRecommendations().getLungDiseases());
    }

    @FXML
    public void click3(){
        lable1.setText(data.getData().getHealthRecommendations().getChildren());
    }

    @FXML
    public void click4(){
        lable1.setText(data.getData().getHealthRecommendations().getElderly());
    }

    @FXML
    public void click5(){
        lable1.setText(data.getData().getHealthRecommendations().getPregnantWomen());
    }

    @FXML
    public void click6(){
        lable1.setText(data.getData().getHealthRecommendations().getActive());
    }

    @FXML
    public void click7(){
        lable1.setText(data.getData().getHealthRecommendations().getHeartDiseases());
    }



    @FXML
    public void clickInfo() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("info.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load());
        Stage newWindow = new Stage();
        newWindow.setTitle("????????????????????");
        newWindow.setScene(secondScene);
        newWindow.setResizable(false);
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.showAndWait();
    }

    @FXML
    public void clickList() throws IOException {
        chartPollutants.setVisible(false);
        list1.setVisible(true);
    }

    @FXML
    public void clickDiagram() throws IOException {
        chartPollutants.setVisible(true);
        list1.setVisible(false);

    }


}