package com.example.ksr.pollutions;

import java.io.Serializable;

public class FullData implements Serializable {
    private String metadata;
    private Data data;
    private String err;

    public FullData(){}

    public FullData(String metadata, Data data, String err){
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

    @Override
    public String toString(){
        return String.format("\"metadata\" : \"%s\", \"data\" : \"%s\", \"err\" : \"%s\"",
                metadata, data.toString(), err);
    }
}
