package com.gamedemo.gameinventorydemo;

import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class TransitItemCell extends StackPane {

    private Item item;
    private final ImageView IMAGE_VIEW = new ImageView();

    public TransitItemCell() {
        this.setWidth(200);
        this.setHeight(200);
        this.getChildren().addAll(IMAGE_VIEW);
        this.setBackground(new Background(new BackgroundImage(ImagePreparation.cell_B_G_Transit,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        if (item != null) {
            this.IMAGE_VIEW.setImage(item.getImage());
        } else {
            this.IMAGE_VIEW.setImage(null);
        }
    }
}
