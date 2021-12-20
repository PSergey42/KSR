package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class BAQI implements Serializable {
    @JsonProperty("display_name")
    private String name;
    @JsonProperty("aqi")
    private int aqi;
    @JsonProperty("aqi_display")
    private String aqiDisplay;
    @JsonProperty("color")
    private String color;
    @JsonProperty("category")
    private String category;

    public BAQI(){}

    public BAQI(String name, int aqi, String aqiDisplay, String color, String category){
        this.name = name;
        this.aqi = aqi;
        this.aqiDisplay = aqiDisplay;
        this.color = color;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public String getAqiDisplay() {
        return aqiDisplay;
    }

    public void setAqiDisplay(String aqiDisplay) {
        this.aqiDisplay = aqiDisplay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return String.format("{\"name\" : \"%s\", \"aqi\" : \"%d\", \"aqiDisplay\" : \"%s\", \"color\" : \"%s\", \"category\" : \"%s\"}",
                name, aqi, aqiDisplay, color, category);
    }
}
