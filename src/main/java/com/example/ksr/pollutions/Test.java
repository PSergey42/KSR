package com.example.ksr.pollutions;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Test {

    public static FullData getFullData(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
        return mapper.readValue(json, FullData.class);
    }
}
