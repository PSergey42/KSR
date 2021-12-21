package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Indexes {
    @JsonProperty("baqi")
    private BAQI2 baqi;

    public Indexes(){}

    public Indexes(BAQI2 baqi){
        this.baqi = baqi;
    }

    public BAQI2 getBaqi() {
        return baqi;
    }

    public void setBaqi(BAQI2 baqi) {
        this.baqi = baqi;
    }

    @Override
    public String toString(){
        return String.format("{\"baqi\" : \"%s\"}",baqi.toString());
    }
}

