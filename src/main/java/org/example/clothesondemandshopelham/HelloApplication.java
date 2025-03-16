package org.example.clothesondemandshopelham;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.clothesondemandshopelham.View.WebShop;
import java.lang.Exception;

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