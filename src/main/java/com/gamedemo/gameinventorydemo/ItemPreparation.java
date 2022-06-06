package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ItemPreparation {

    public static List<Item> itemsS = new ArrayList<>();
    public static List<Item> itemsM = new ArrayList<>();
    public static List<Item> itemsL = new ArrayList<>();

    private final static String PATH = "src/main/resources/com/gamedemo/Images/";
    private final static String EQUIPMENTS = "Items/Equipments/";
    private final static String WEAPONS = "Items/Weapons/";

    public static void prepare() throws FileNotFoundException {

        for (int i = 1; i <= 4; i++) {
            Image image = new Image(new FileInputStream(PATH + WEAPONS + "Grenade" + i + ".png"));
            itemsS.add(new Item("G" + i, image, Size.SMALL));
        }

        for (int i = 1; i <= 2; i++) {
            String name = "Pistol";
            Image image = new Image(new FileInputStream(PATH + WEAPONS + name + i + ".png"));
            itemsM.add(new Item(name + i, image));
        }

        for (int i = 1; i <= 3; i++) {
            String name = "Armor";
            Image image = new Image(new FileInputStream(PATH + EQUIPMENTS + name + i + ".png"));
            itemsM.add(new Item(name + i, image));
        }

        for (int i = 1; i <= 2; i++) {
            String name = "Boot";
            Image image = new Image(new FileInputStream(PATH + EQUIPMENTS + name + i + ".png"));
            itemsM.add(new Item(name + i, image));
        }

        for (int i = 1; i <= 4; i++) {
            String name = "Hat";
            Image image = new Image(new FileInputStream(PATH + EQUIPMENTS + name + i + ".png"));
            itemsM.add(new Item(name + i, image));
        }

        itemsM.add(new Item("Bag", new Image(new FileInputStream(PATH + EQUIPMENTS + "Bag.png"))));
        itemsM.add(new Item("Belt", new Image(new FileInputStream(PATH +  EQUIPMENTS + "Belt.png"))));

        for (int i = 1; i <= 5; i++) {
            Image image = new Image(new FileInputStream(PATH + WEAPONS + "Rifle" + i + ".png"));
            itemsL.add(new Item("Rifle" + i, image, Size.LARGE));
        }
    }
}
