package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ImagePreparation {

    public static List<Item> itemsS = new ArrayList<>();
    public static List<Item> itemsM = new ArrayList<>();
    public static List<Item> itemsL = new ArrayList<>();

    public static Image cell_B_G_S;
    public static Image cell_B_G_M;
    public static Image cell_B_G_L;
    public static Image cell_B_G_Transit;

    public static String path = "src/main/resources/com/gamedemo/Images/";

    public static void prepare() throws FileNotFoundException {
        cell_B_G_S = new Image(new FileInputStream(path + "UI/CellBGS.png"));
        cell_B_G_M = new Image(new FileInputStream(path + "UI/CellBGM.png"));
        cell_B_G_L = new Image(new FileInputStream(path + "UI/CellBGL.png"));
        cell_B_G_Transit = new Image(new FileInputStream(path + "UI/CellBGTransit.png"));


        for (int i = 1; i <= 4; i++) {
            Image image = new Image(new FileInputStream(path + "Items/Weapons/Grenade" + i + ".png"));
            itemsS.add(new Item("G" + i, image, Size.SMALL));
        }

        for (int i = 1; i <= 2; i++) {
            Image image = new Image(new FileInputStream(path + "Items/Weapons/Pistol" + i + ".png"));

            itemsM.add(new Item("Pistol" + i, image));
        }

        for (int i = 1; i <= 3; i++) {
            String name = "Armor";
            Image image = new Image(new FileInputStream(path + "Items/Equipments/" + name + i + ".png"));

            itemsM.add(new Item(name + i, image));
        }

        for (int i = 1; i <= 2; i++) {
            String name = "Boot";
            Image image = new Image(new FileInputStream(path + "Items/Equipments/" + name + i + ".png"));

            itemsM.add(new Item(name + i, image));
        }

        for (int i = 1; i <= 4; i++) {
            String name = "Hat";
            Image image = new Image(new FileInputStream(path + "Items/Equipments/" + name + i + ".png"));

            itemsM.add(new Item(name + i, image));
        }

        itemsM.add(new Item("Bag", new Image(new FileInputStream(path + "Items/Equipments/Bag.png"))));
        itemsM.add(new Item("Belt", new Image(new FileInputStream(path + "Items/Equipments/Belt.png"))));

        for (int i = 1; i <= 5; i++) {
            Image image = new Image(new FileInputStream(path + "Items/Weapons/Rifle" + i + ".png"));

            itemsL.add(new Item("Rifle" + i, image, Size.LARGE));
        }
    }
}
