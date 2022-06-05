package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

public class ItemCellMedium extends ItemCell {

    static Size containItemSize = Size.MEDIUM;
    static Image image = ImagePreparation.cell_B_G_M;
    static int width = 100;

    public ItemCellMedium(TransitItemCell transitCell) {
        super(transitCell, containItemSize, image, width);
        applyView();
        applyAction();
    }
}
