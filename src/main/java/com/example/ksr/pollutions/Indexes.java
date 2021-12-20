package com.example.ksr.pollutions;

public class Indexes {
    private BAQI baqi;

    public Indexes(){}

    public Indexes(BAQI baqi){
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
        return String.format("{\"baqi\" : \"%s\"}",baqi.toString());
    }
}
