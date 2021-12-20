package com.example.ksr;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController{

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

    public HelloController(){

    }
    private GoogleMap googleMap;

    @FXML
    void initialize() throws MalformedURLException {
        panel.setVisible(false);
        GoogleMap googleMap = new GoogleMap(webViewMap);
        GoogleMap.setHelloController(this);
        ControllerForm2.setBobr(buttonObr);
    }

    @FXML
    public void clickObr() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dopView.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 386, 109);
        Stage newWindow = new Stage();
        newWindow.setTitle("Обработка");
        newWindow.setScene(secondScene);
        newWindow.setResizable(false);
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.showAndWait();
    }

    public GoogleMap getGoogleMap(){
        return googleMap;
    }

    public void paneIsVisible(){
        panel.setVisible(true);
    }








}