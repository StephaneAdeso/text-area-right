package com.adeso.custom.textarea.launcher;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class Launcher extends Application {

    // TODO:
    // [ ] crear el módulo de textarea
    // [ ] revisar los xml, sus nombres y carpetas
    // [ ] pasar el plugin al pom padre

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = FXMLLoader.load(getClass()
                .getResource("launcher.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setMinHeight(120);
        stage.sizeToScene();
        stage.show();
    }

}