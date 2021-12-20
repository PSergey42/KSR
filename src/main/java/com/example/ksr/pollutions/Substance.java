package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Substance implements Serializable {
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("aqi_information")
    private AqiInformation aqiInformation;
    @JsonProperty("concentration")
    private Concentrations concentration;

    public Substance(){}

    public Substance(String displayName, String fullName, AqiInformation aqiInformation, Concentrations concentrate){
        this.displayName = displayName;
        this.fullName = fullName;
        this.aqiInformation = aqiInformation;
        this.concentration = concentrate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public AqiInformation getAqiInformation() {
        return aqiInformation;
    }

    public void setAqiInformation(AqiInformation aqiInformation) {
        this.aqiInformation = aqiInformation;
    }

    public Concentrations getConcentration() {
        return concentration;
    }

    public void setConcentration(Concentrations concentrate) {
        this.concentration = concentrate;
    }

    @Override
    public String toString(){
        String aqi = this.aqiInformation.toString();
        String concentrate = this.concentration.toString();
        return String.format("{\"displayName\" : \"%s\", \"fullName\" : \"%s\", \"aqiInformation\" : \"%s\", \"concentration\" : \"%s\"}",
                displayName, fullName, aqi, concentrate);
    }
}
