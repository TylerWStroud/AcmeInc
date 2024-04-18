package com.acme.swe3313;

import com.acme.swe3313.models.Customer;
import com.acme.swe3313.util.JSON;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application extends javafx.application.Application {
    public static List<Customer> customers = new ArrayList<>();
    public static final String PROGRAM_DATA_PATH = System.getenv("APPDATA") + "\\Acme Distributing";
    private static Stage primaryStage;



    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Acme Distributing");
        stage.setScene(scene);
        stage.show();
        stage.setMaximized(true);
    }

    /**
     * Sets the current scene (Think of this as a page router)
     * @param fxml
     * @throws IOException
     */
    public static void setScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(fxml));

        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
    }

    /**
     * Initialize the files needed for the program
     */
    public static void createConfigFiles() throws IOException {
        // Ensure the program data directory exists
        new File(PROGRAM_DATA_PATH).mkdirs();

        // Ensure the customers.json file exists, and create it if it doesn't.
        File customersFile = new File(PROGRAM_DATA_PATH + "\\customers.json");
        boolean customersFileCreated =  customersFile.createNewFile();

        // If the file was just created, write an empty json object to it
        if (customersFileCreated) {
            JSON.write("/customers.json", new JSONObject());
        }

        // Ensure the orders.json file exists, and create it if it doesn't.
        File ordersFile = new File(PROGRAM_DATA_PATH + "\\orders.json");
        boolean ordersFileCreated = ordersFile.createNewFile();

        // If the file was just created, write an empty json object to it
        if (ordersFileCreated) {
            JSON.write("/orders.json", new JSONObject());
        }
    }

    public static void main(String[] args) {
        // First, create the necessary files
        try {
            createConfigFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }

        launch();
    }

}