package com.acme.swe3313;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Application extends javafx.application.Application {
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
        customersFile.createNewFile();

        // Ensure the orders.json file exists, and create it if it doesn't.
        File ordersFile = new File(PROGRAM_DATA_PATH + "\\orders.json");
        ordersFile.createNewFile();
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

    //Alex was here
}