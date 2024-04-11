package com.acme.swe3313.models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Associate {
    private boolean isLoggedIn = false;
    private String name;
    private String email;


    private boolean login(String email, String password) throws IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader("associates.json"));

        JSONObject jsonObject = (JSONObject) object;

        // Loop through the array of associates and check if the email and password match for any of them
        for (Object associate : (Iterable<?>) jsonObject) {
            JSONObject associateObject = (JSONObject) associate;

            if (associateObject.get("email").equals(email) && associateObject.get("password").equals(password)) {
                this.isLoggedIn = true;
                this.name = (String) associateObject.get("name");
                this.email = (String) associateObject.get("email");
                return true;
            }
        }

        return false;
    }
}
