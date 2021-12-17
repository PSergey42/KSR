package com.example.ksr;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController extends Parent {


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