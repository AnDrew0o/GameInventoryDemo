package com.gamedemo.gameinventorydemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GameMainWindow extends Application {

    public static List<Item> itemsS = new ArrayList<>();
    public static List<Item> itemsM = new ArrayList<>();
    public static List<Item> itemsL = new ArrayList<>();

    public static Image cell_B_G_S;
    public static Image cell_B_G_M;
    public static Image cell_B_G_L;
    public static Image cell_B_G_Transit;

    public GameMainWindow() throws FileNotFoundException {
        cell_B_G_S = new Image(new FileInputStream("src/main/resources/com/gamedemo/Images/UI/CellBGS.png"));
        cell_B_G_M = new Image(new FileInputStream("src/main/resources/com/gamedemo/Images/UI/CellBGM.png"));
        cell_B_G_L = new Image(new FileInputStream("src/main/resources/com/gamedemo/Images/UI/CellBGL.png"));
        cell_B_G_Transit = new Image(new FileInputStream("src/main/resources/com/gamedemo/Images/UI/CellBGTransit.png"));
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        for (int i = 1; i <= 4; i++) {
            Image image = new Image(new FileInputStream("src/main/resources/com/gamedemo/Images/Items/Grenade" + i + ".png"));
            itemsS.add(new Item("Grenade" + i, image, Size.SMALL));
        }

        for (int i = 1; i <= 2; i++) {
            Image image = new Image(new FileInputStream("src/main/resources/com/gamedemo/Images/Items/Pistol" + i + ".png"));

            itemsM.add(new Item("Pistol" + i, image));
        }

        for (int i = 1; i <= 5; i++) {
            Image image = new Image(new FileInputStream("src/main/resources/com/gamedemo/Images/Items/Rifle" + i + ".png"));

            itemsL.add(new Item("Rifle" + i, image, Size.LARGE));
        }

        BorderPane mainWindowView = new BorderPane();
        mainWindowView.setBackground(new Background(new BackgroundFill(Color.LIGHTSEAGREEN, null, null)));

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