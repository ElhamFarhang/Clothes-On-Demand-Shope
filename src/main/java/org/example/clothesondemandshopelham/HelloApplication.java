package org.example.clothesondemandshopelham;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.clothesondemandshopelham.View.WebShop;

import java.io.IOException;

public class HelloApplication extends Application {
    private WebShop webShop = new WebShop();
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        webShop.start(primaryStage);
    }
}