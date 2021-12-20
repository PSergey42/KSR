package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Data implements Serializable {
    @JsonProperty("datetime")
    private String dateTime;
    @JsonProperty("data_available")
    private boolean dataAvailable;
    @JsonProperty("indexes")
    private Indexes indexes;
    @JsonProperty("pollutants")
    private Map<String, Substance> pollutants;
    @JsonProperty("health_recommendations")
    private HealthRecommendations healthRecommendations;

    public Data(){
        pollutants = new HashMap<>();
    }

    public Data(String dateTime, boolean dataAvailable, Indexes indexes, Map<String, Substance> pollutants, HealthRecommendations healthRecommendations){
        this.dateTime = dateTime;
        this.dataAvailable = dataAvailable;
        this.indexes = indexes;
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

    public Map<String, Substance> getPollutants() {
        return pollutants;
    }


    public Indexes getIndexes() {
        return indexes;
    }

    public void setIndexes(Indexes indexes) {
        this.indexes = indexes;
    }

    public void setPollutants(Map<String, Substance> pollutants) {
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
                dateTime, dataAvailable, pollutants.toString(), healthRecommendations);
    }

}
