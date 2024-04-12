package com.acme.swe3313;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
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

    public static void main(String[] args) {
        launch();
    }
}