package com.acme.swe3313.util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class JSON {
    /**
     * Parse a JSON file and return the parsed object
     * @param fileName
     * @return
     */
    public static JSONObject parse(String fileName) {
        Reader reader = new InputStreamReader((JSON.class.getResourceAsStream(fileName)));

        try {
            JSONParser parser = new JSONParser();
            JSONObject parsedJson = (JSONObject) parser.parse(reader);

            return parsedJson;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}