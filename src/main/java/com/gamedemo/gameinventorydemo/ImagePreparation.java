package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImagePreparation {

    public static Image cell_B_G_S;
    public static Image cell_B_G_M;
    public static Image cell_B_G_L;
    public static Image cell_B_G_Transit;

    private final static String PATH = "src/main/resources/com/gamedemo/Images/";
    private final static String UI = "UI/";

    public static void prepare() throws FileNotFoundException {
        cell_B_G_S = new Image(new FileInputStream(PATH + UI + "CellBGS.png"));
        cell_B_G_M = new Image(new FileInputStream(PATH + UI +"CellBGM.png"));
        cell_B_G_L = new Image(new FileInputStream(PATH + UI +"CellBGL.png"));
        cell_B_G_Transit = new Image(new FileInputStream(PATH + UI + "CellBGTransit.png"));
    }
}
