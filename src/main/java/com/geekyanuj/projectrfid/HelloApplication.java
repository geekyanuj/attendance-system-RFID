package com.geekyanuj.projectrfid;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(getClass().getResource("Home.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
//        double height=  Screen.getPrimary().getBounds().getHeight();
//        double width=   Screen.getPrimary().getBounds().getWidth();
        Scene scene = new Scene(fxmlLoader.load(), 1366, 768);

        stage.setTitle("Attendance System");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}