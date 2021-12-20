package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AqiInformation {
    @JsonProperty("baqi")
    private BAQI baqi;

    public AqiInformation(){}

    public AqiInformation(BAQI baqi) {
        this.baqi = baqi;
    }

    public BAQI getBaqi() {
        return baqi;
    }

    public void setBaqi(BAQI baqi) {
        this.baqi = baqi;
    }

    @Override
    public String toString(){
        return baqi.toString();
    }
}
