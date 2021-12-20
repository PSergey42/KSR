package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class HealthRecommendations implements Serializable {
    @JsonProperty("general_population")
    private String generalPopulation;
    @JsonProperty("elderly")
    private String elderly;
    @JsonProperty("lung_diseases")
    private String lungDiseases;
    @JsonProperty("heart_diseases")
    private String heartDiseases;
    @JsonProperty("active")
    private String active;
    @JsonProperty("pregnant_women")
    private String pregnantWomen;
    @JsonProperty("children")
    private String children;

    public HealthRecommendations(){}

    public HealthRecommendations(
            String generalPopulation, String elderly, String lungDiseases,
            String heartDiseases, String active, String pregnantWomen, String children
    ){
        this.generalPopulation = generalPopulation;
        this.elderly = elderly;
        this.lungDiseases = lungDiseases;
        this.heartDiseases = heartDiseases;
        this.active = active;
        this.pregnantWomen = pregnantWomen;
        this.children = children;
    }


    public String getGeneralPopulation() {
        return generalPopulation;
    }

    public void setGeneralPopulation(String generalPopulation) {
        this.generalPopulation = generalPopulation;
    }

    public String getElderly() {
        return elderly;
    }

    public void setElderly(String elderly) {
        this.elderly = elderly;
    }

    public String getLungDiseases() {
        return lungDiseases;
    }

    public void setLungDiseases(String lungDiseases) {
        this.lungDiseases = lungDiseases;
    }

    public String getHeartDiseases() {
        return heartDiseases;
    }

    public void setHeartDiseases(String heartDiseases) {
        this.heartDiseases = heartDiseases;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getPregnantWomen() {
        return pregnantWomen;
    }

    public void setPregnantWomen(String pregnantWomen) {
        this.pregnantWomen = pregnantWomen;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    @Override
    public String toString(){
        return String.format("{\"generalPopulation\" : \"%s\", \"elderly\" : \"%s\", \"lungDiseases\" : \"%s\", " +
                        "\"heartDiseases\" : \"%s\", \"active\" : \"%s\", \"pregnantWomen\" : \"%s\", \"children\" : \"%s\"}",
                generalPopulation, elderly, lungDiseases, heartDiseases, active, pregnantWomen, children);
    }
}
