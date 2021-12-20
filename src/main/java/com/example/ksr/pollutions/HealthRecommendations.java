package com.example.ksr.pollutions;

import java.io.Serializable;

public class HealthRecommendations implements Serializable {
    private String generalPopulation;
    private String elderly;
    private String lungDiseases;
    private String heartDiseases;
    private String active;
    private String pregnantWomen;
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
