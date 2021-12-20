package com.example.ksr;

import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class GoogleMap extends Parent{

    private JSObject doc;
    private EventHandler<MapEvent> onMapLatLngChanged;
    private WebView webViewMap;
    private WebEngine webEngine;
    private boolean ready;
    private static HelloController helloController = new HelloController();

    public GoogleMap(WebView webView) {
        this.webViewMap = webView;
        initMap();
        initCommunication();
    }

    private void initMap() {
        //webViewMap = new WebView();
        webEngine = webViewMap.getEngine();
        webEngine.load(getClass().getResource("index.html").toExternalForm());
        ready = false;
        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
            @Override
            public void changed(final ObservableValue<? extends Worker.State> observableValue,
                                final Worker.State oldState,
                                final Worker.State newState) {
                if (newState == Worker.State.SUCCEEDED) {
                    ready = true;
                }
            }
        });
    }

    private void initCommunication() {
        /*webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
            @Override
            public void changed(final ObservableValue<? extends Worker.State> observableValue,
                                final Worker.State oldState,
                                final Worker.State newState) {
                if (newState == Worker.State.SUCCEEDED) {
                    doc = (JSObject) webEngine.executeScript("window");
                    doc.setMember("app", GoogleMap.this);
                }
            }
        });*/
        doc = (JSObject) webEngine.executeScript("window");
        doc.setMember("app", GoogleMap.this);
    }

    private void invokeJS(final String str) {
        if (ready) {
            doc.eval(str);
        } else {
            webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                @Override
                public void changed(final ObservableValue<? extends Worker.State> observableValue,
                                    final Worker.State oldState,
                                    final Worker.State newState) {
                    if (newState == Worker.State.SUCCEEDED) {
                        doc.eval(str);
                    }
                }
            });
        }
    }

    public void setOnMapLatLngChanged(EventHandler<MapEvent> eventHandler) {
        onMapLatLngChanged = eventHandler;
    }

    public void handle(double lat, double lng) {
        if (onMapLatLngChanged != null) {
            MapEvent event = new MapEvent(this, lat, lng);
            System.out.println("event");
            System.out.println(event);
            onMapLatLngChanged.handle(event);
        }
    }

    public void setMarkerPosition(double lat, double lng) {
        String sLat = Double.toString(lat);
        String sLng = Double.toString(lng);
        invokeJS("setMarkerPosition(" + sLat + ", " + sLng + ")");
    }

    public void setMapCenter(double lat, double lng) {
        String sLat = Double.toString(lat);
        String sLng = Double.toString(lng);
        invokeJS("setMapCenter(" + sLat + ", " + sLng + ")");
    }

    public void getXY(double lat, double lng) {
        String sLat = Double.toString(lat);
        String sLng = Double.toString(lng);
        System.out.println("setMapCenter(" + sLat + ", " + sLng + ")");
    }

    public void getInfoJS(double lat, double lng) throws IOException {
        URL url = new URL(String.format("https://api.breezometer.com/air-quality/v2/current-conditions?lat=%s&lon=%s&key=312adece2c4d4312993604b76b464369&features=pollutants_aqi_information,pollutants_concentrations,health_recommendations",lat,lng));
        URLConnection urlConnection = url.openConnection();
        System.out.println(String.format("https://api.breezometer.com/air-quality/v2/current-conditions?lat=%s&lon=%s&key=312adece2c4d4312993604b76b464369&features=pollutants_aqi_information,pollutants_concentrations,health_recommendations",lat,lng));
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String f = in.readLine();
        ControllerForm2.setFulData(Test.getFullData(f));
        HelloController.setFulData(Test.getFullData(f));
        helloController.paneIsVisible();
    }

    public void switchSatellite() {
        invokeJS("switchSatellite()");
    }

    public void switchRoadmap() {
        invokeJS("switchRoadmap()");
    }

    public void switchHybrid() {
        invokeJS("switchHybrid()");
    }

    public void switchTerrain() {
        invokeJS("switchTerrain()");
    }

    public void startJumping() {
        invokeJS("startJumping()");
    }

    public void stopJumping() {
        invokeJS("stopJumping()");
    }

    public void setHeight(double h) {
        webViewMap.setPrefHeight(h);
    }

    public void setWidth(double w) {
        webViewMap.setPrefWidth(w);
    }

    public ReadOnlyDoubleProperty widthProperty() {
        return webViewMap.widthProperty();
    }


}
