package com.gamedemo.gameinventorydemo;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class InventoryCreative extends FlowPane {

    List<ItemCell> itemCells = new ArrayList<>();

    public InventoryCreative(TransitItemCell transitCell) {
        this.setMinWidth(410);

        for (Item item : GameMainWindow.itemsS) {
            ItemCell itemCell = new ItemCellSmall(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
        for (Item item : GameMainWindow.itemsM) {
            ItemCell itemCell = new ItemCellMedium(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
        for (Item item : GameMainWindow.itemsL) {
            ItemCell itemCell = new ItemCellLarge(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }

        for (ItemCell itemCell : itemCells) {
            this.getChildren().add(itemCell);
        }
    }
}
