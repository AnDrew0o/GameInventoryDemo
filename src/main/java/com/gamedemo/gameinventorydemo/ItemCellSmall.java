package com.gamedemo.gameinventorydemo;

import javafx.scene.image.Image;

public class ItemCellSmall extends ItemCell {

    private static final Size CONTAIN_ITEM_SIZE = Size.SMALL;
    private static final Image IMAGE = ImagePreparation.cell_B_G_S;
    private static final int WIDTH = 50;

    public ItemCellSmall(TransitItemCell transitCell) {
        super(transitCell, CONTAIN_ITEM_SIZE, IMAGE, WIDTH);
        applyView();
        applyAction();
    }
}
