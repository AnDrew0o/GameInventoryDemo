package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

public class ItemCellMedium extends ItemCell {

    private static final Size CONTAIN_ITEM_SIZE = Size.MEDIUM;
    private static final Image IMAGE = ImagePreparation.cell_B_G_M;
    private static final int WIDTH = 100;

    public ItemCellMedium(TransitItemCell transitCell) {
        super(transitCell, CONTAIN_ITEM_SIZE, IMAGE, WIDTH);
        applyView();
        applyAction();
    }
}
