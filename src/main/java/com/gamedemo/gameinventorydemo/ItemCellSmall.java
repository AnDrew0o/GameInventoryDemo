package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

public class ItemCellSmall extends ItemCell {

    static Size containItemSize = Size.SMALL;
    static Image image = ImagePreparation.cell_B_G_S;
    static int width = 50;

    public ItemCellSmall(TransitItemCell transitCell) {
        super(transitCell, containItemSize, image, width);
        applyView();
        applyAction();
    }
}
