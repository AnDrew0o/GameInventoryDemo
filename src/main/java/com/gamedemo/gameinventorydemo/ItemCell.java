package com.gamedemo.gameinventorydemo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public abstract class ItemCell extends StackPane {

    Item item;

    Button button = new Button();
    ImageView imageView = new ImageView();
    Label label = new Label();

    double opacity = 0;
    String empty = "empty";
    int height = 100;

    TransitItemCell transitCell;
    Size containItemSize;
    Image backgroundImage;
    int width;

    public ItemCell(TransitItemCell transitCell, Size containItemSize, Image image, int width) {
        this.transitCell = transitCell;
        this.containItemSize = containItemSize;
        this.backgroundImage = image;
        this.width = width;
    }

    public void setItem(Item item) {
        this.item = item;
        if (item != null) {
            this.imageView.setImage(item.getImage());
            this.label.setText(item.getName());
        } else {
            this.imageView.setImage(null);
            this.label.setText(empty);
        }
    }

    void applyAction() {
        button.setOnAction(e -> {
            if (item == null && transitCell.getItem() != null && transitCell.getItem().getSize() == containItemSize) {
                this.setItem(transitCell.getItem());
                transitCell.setItem(null);
            } else if (transitCell.getItem() == null && item != null) {
                transitCell.setItem(item);
                this.setItem(null);
            }
            else if (transitCell.getItem() != item && transitCell.getItem().getSize() == containItemSize) {
                Item tempItem = item;
                this.setItem(transitCell.getItem());
                transitCell.setItem(tempItem);
            }
        });
    }

    void applyView() {
        this.setBackground(new Background(new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));

        label.setText(empty);

        button.setMinSize(width, height);
        button.setOpacity(opacity);
        button.setFocusTraversable(false);

        this.setAlignment(Pos.BOTTOM_CENTER);
        StackPane.setMargin(label, new Insets(0,0,5,0));
        this.getChildren().addAll(imageView, label, button);
    }
}
