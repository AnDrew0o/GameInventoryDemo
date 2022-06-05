package com.gamedemo.gameinventorydemo;

import javafx.scene.layout.StackPane;

public abstract class ItemCell extends StackPane {

    public ItemCell() {
    }

    abstract void setItem(Item item);
}
