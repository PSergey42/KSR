package com.example.ksr.pollutions;

import java.io.Serializable;

public class Substance implements Serializable {
    protected String name;
    protected String fullName;
    protected AQI aqi;
    protected Concentrations concentrate;

    public Substance(){}

    public Substance(String name, String fullName, AQI aqi, Concentrations concentrate){
        this.name = name;
        this.fullName = fullName;
        this.aqi = aqi;
        this.concentrate = concentrate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public AQI getAqi() {
        return aqi;
    }

    public void setAqi(AQI aqi) {
        this.aqi = aqi;
    }

    public Concentrations getConcentrate() {
        return concentrate;
    }

    public void setConcentrate(Concentrations concentrate) {
        this.concentrate = concentrate;
    }

    @Override
    public String toString(){
        String aqi = this.aqi.toString();
        String concentrate = this.concentrate.toString();
        return String.format("{\"name\" : \"%s\", \"fullName\" : \"%s\", \"aqi\" : \"%s\", \"concentrate\" : \"%s\"}",
                name, fullName, aqi, concentrate);
    }
}
