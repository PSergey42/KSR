package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Concentrations implements Serializable {
    @JsonProperty("value")
    private double value;
    @JsonProperty("units")
    private String units;

    public Concentrations(){}

    public Concentrations(double value, String units){
        this.value = value;
        this.units = units;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return units;
    }

    public void setType(String type) {
        this.units = type;
    }

    @Override
    public String toString(){
        return String.format("{\"value\" : \"%s\", \"units\" : \"%s\"}", value, units);
    }
}
