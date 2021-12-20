package com.example.ksr.pollutions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Test {

    public static FullData getFullData(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, FullData.class);
    }
}
