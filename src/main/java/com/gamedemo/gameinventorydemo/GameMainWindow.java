package com.gamedemo.gameinventorydemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class GameMainWindow extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        ImagePreparation.prepare();

        BorderPane mainWindowView = new BorderPane();

        TransitItemCell transitCell = new TransitItemCell();
        InventoryTest testInventory = new InventoryTest(transitCell);
        InventoryCreative creativeInventory = new InventoryCreative(transitCell);

        mainWindowView.setLeft(testInventory);
        mainWindowView.setCenter(transitCell);
        mainWindowView.setRight(creativeInventory);

        Scene scene = new Scene(mainWindowView, 1200, 600);

        stage.setTitle("Inventory Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}