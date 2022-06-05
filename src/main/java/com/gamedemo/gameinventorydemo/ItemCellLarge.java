package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

public class ItemCellLarge extends ItemCell {

    static Size containItemSize = Size.LARGE;
    static Image image = ImagePreparation.cell_B_G_L;
    static int width = 200;

    public ItemCellLarge(TransitItemCell transitCell) {
        super(transitCell, containItemSize, image, width);
        applyView();
        applyAction();
    }
}
