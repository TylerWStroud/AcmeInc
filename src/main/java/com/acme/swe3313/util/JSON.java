package com.acme.swe3313.util;

import com.acme.swe3313.Application;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class JSON {
    /**
     * Parse a JSON file and return the parsed object
     * @param fileName
     * @return the parsed JSON object
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

    /**
     * Parse a dynamic JSON file from the program data path
     * @param fileName
     * @return the parsed JSON object
     */
    public static JSONObject parseDynamic(String fileName) {
        String path = Application.PROGRAM_DATA_PATH + fileName;

        try {
            JSONParser parser = new JSONParser();
            JSONObject parsedJson = (JSONObject) parser.parse(new FileReader(path));

            return parsedJson;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Write a JSON object to a file
     * @param fileName
     * @param jsonObject
     */
    public static void write(String fileName, JSONObject jsonObject) {
        String path = Application.PROGRAM_DATA_PATH + fileName;

        try {
            // Ensure the file exists, create it if it doesn't
            // This will NOT overwrite the file if it already exists
            new File(path).createNewFile();

            // Attempt to write the JSON object to the file
            try (FileWriter fileWriter = new FileWriter(path)) {
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
