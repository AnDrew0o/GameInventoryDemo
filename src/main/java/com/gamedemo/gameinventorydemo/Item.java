package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

public class Item {

    private String name;
    private Image image;
    private Size size;

    public Item(String name, Image image) {
        this.name = name;
        this.image = image;
        this.size = Size.MEDIUM;
    }

    public Item(String name, Image image, Size size) {
        this.name = name;
        this.image = image;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }

    public Size getSize() {
        return size;
    }
}
