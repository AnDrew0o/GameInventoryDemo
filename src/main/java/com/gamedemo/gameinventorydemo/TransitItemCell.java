package com.gamedemo.gameinventorydemo;

import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class TransitItemCell extends StackPane {

    private Item item;
    private final ImageView imageView = new ImageView();

    public TransitItemCell() {
        this.setWidth(200);
        this.setHeight(200);
        this.getChildren().addAll(imageView);
        this.setBackground(new Background(new BackgroundImage(GameMainWindow.cell_B_G_L,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        if (item != null) {
            this.imageView.setImage(item.getImage());
        } else {
            this.imageView.setImage(null);
        }
    }
}
