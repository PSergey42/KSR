package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BAQI2 extends BAQI{
    @JsonProperty("dominant_pollutant")
    private String dominantPollutant;

    public BAQI2(){
        super();
    }

    public BAQI2(String name, int aqi, String aqiDisplay, String color, String category, String dominantPollutant){
        super(name, aqi, aqiDisplay, color, category);
        this.dominantPollutant = dominantPollutant;
    }

    public String getDominantPollutant() {
        return dominantPollutant;
    }

    public void setDominantPollutant(String dominantPollutant) {
        this.dominantPollutant = dominantPollutant;
    }

    @Override
    public String toString(){
        return String.format("{\"name\" : \"%s\", \"aqi\" : \"%d\", \"aqiDisplay\" : \"%s\", \"color\" : \"%s\", \"category\" : \"%s\", \"dominantPollutant\" : \"%s\"}",
                name, aqi, aqiDisplay, color, category, dominantPollutant);
    }
}
