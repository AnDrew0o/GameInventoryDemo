package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

public class ItemCellLarge extends ItemCell {

    private static final Size CONTAIN_ITEM_SIZE = Size.LARGE;
    private static final Image IMAGE = ImagePreparation.cell_B_G_L;
    private static final int WIDTH = 200;

    public ItemCellLarge(TransitItemCell transitCell) {
        super(transitCell, CONTAIN_ITEM_SIZE, IMAGE, WIDTH);
        applyView();
        applyAction();
    }
}
