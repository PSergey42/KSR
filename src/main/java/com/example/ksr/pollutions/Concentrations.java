package com.example.ksr.pollutions;

import java.io.Serializable;

public class Concentrations implements Serializable {
    private double value;
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
