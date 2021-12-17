package com.example.ksr;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloController{


    @FXML
    private WebView webViewMap;


    @FXML
    void initialize() throws MalformedURLException {
        /*File file = new File("D:/Programs/KSR/src/main/resources/com/example/ksr/index.html");
        URL url= file.toURI().toURL();
        webViewMap.getEngine().load(url.toString());*/
        GoogleMap googleMap = new GoogleMap(webViewMap);

    }








}