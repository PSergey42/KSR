package com.example.ksr.pollutions;

import java.io.Serializable;
import java.util.Arrays;

public class Data implements Serializable {
    private String dateTime;
    private boolean dataAvailable;
    private Substance[] pollutants;
    private HealthRecommendations healthRecommendations;

    public Data(){}

    public Data(String dateTime, boolean dataAvailable, Substance[] pollutants, HealthRecommendations healthRecommendations){
        this.dateTime = dateTime;
        this.dataAvailable = dataAvailable;
        this.pollutants = pollutants;
        this.healthRecommendations = healthRecommendations;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isDataAvailable() {
        return dataAvailable;
    }

    public void setDataAvailable(boolean dataAvailable) {
        this.dataAvailable = dataAvailable;
    }

    public Substance[] getPollutants() {
        return pollutants;
    }

    public void setPollutants(Substance[] pollutants) {
        this.pollutants = pollutants;
    }

    public HealthRecommendations getHealthRecommendations() {
        return healthRecommendations;
    }

    public void setHealthRecommendations(HealthRecommendations healthRecommendations) {
        this.healthRecommendations = healthRecommendations;
    }

    @Override
    public String toString(){
        return String.format("{\"dateTime\" : \"%s\", \"dataAvailable\" : \"%s\", \"pollutants\" : \"%s\", \"healthRecommendations\" : \"%s\"}",
                dateTime, dataAvailable, Arrays.toString(pollutants), healthRecommendations);
    }
}
