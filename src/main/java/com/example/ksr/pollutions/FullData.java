package com.example.ksr.pollutions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.function.DoublePredicate;

public class FullData implements Serializable {
    @JsonProperty("metadata")
    private String metadata;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("error")
    private String err;

    public FullData() {
    }

    public FullData(String metadata, Data data, String err) {
        this.metadata = metadata;
        this.data = data;
        this.err = err;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public static double convert(Substance pollutant) {
        double value = pollutant.getConcentration().getValue();
        double molecularWeight = 0;
        switch (pollutant.getDisplayName()) {
            case "CO":
                molecularWeight = 28.01;
                break;
            case "NO2":
                molecularWeight = 46.0055;
                break;
            case "O3":
                molecularWeight = 48;
                break;
            case "PM10":
                return value;
            case "PM2.5":
                return value;
            case "SO2":
                molecularWeight = 64.066;
                break;
        }

        if (pollutant.getConcentration().getType().equals("ppb") && molecularWeight != 0) {
            //pollutant.getConcentration().setValue(0);
            //pollutant.getConcentration().setType("ppb");
            return molecularWeight * pollutant.getConcentration().getValue() / 24.45;
        }
        throw new RuntimeException("Ban");
    }

    @Override
    public String toString() {
        return String.format("{\"metadata\" : \"%s\", \"data\" : \"%s\", \"err\" : \"%s\"}",
                metadata, data.toString(), err);
    }
}
