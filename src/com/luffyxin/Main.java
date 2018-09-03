package com.luffyxin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by ${DX} on 2018/9/2.
 */
public class Main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/webView.fxml"));

        Scene scene = new Scene(root, 1280, 720);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.setTitle("习题");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
