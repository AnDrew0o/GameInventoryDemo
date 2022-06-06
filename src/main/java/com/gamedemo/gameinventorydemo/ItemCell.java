package com.gamedemo.gameinventorydemo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public abstract class ItemCell extends StackPane {

    private Item item;

    private final Button BUTTON = new Button();
    private final ImageView IMAGE_VIEW = new ImageView();
    private final Label LABEL = new Label();

    private final double OPACITY = 0;
    private final String EMPTY = "empty";
    private final int HEIGHT = 100;

    private TransitItemCell transitCell;
    private Size containItemSize;
    private Image backgroundImage;
    private int width;

    public ItemCell(TransitItemCell transitCell, Size containItemSize, Image image, int width) {
        this.transitCell = transitCell;
        this.containItemSize = containItemSize;
        this.backgroundImage = image;
        this.width = width;
    }

    public void setItem(Item item) {
        this.item = item;
        if (item != null) {
            this.IMAGE_VIEW.setImage(item.getImage());
            this.LABEL.setText(item.getName());
        } else {
            this.IMAGE_VIEW.setImage(null);
            this.LABEL.setText(EMPTY);
        }
    }

    void applyAction() {
        BUTTON.setOnAction(e -> {
            if (item == null && transitCell.getItem() != null && transitCell.getItem().getSize().getWeight() <= containItemSize.getWeight()) {
                this.setItem(transitCell.getItem());
                transitCell.setItem(null);
            } else if (transitCell.getItem() == null && item != null) {
                transitCell.setItem(item);
                this.setItem(null);
            }
            else if (transitCell.getItem() != item && transitCell.getItem().getSize().getWeight() <= containItemSize.getWeight()) {
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

        LABEL.setText(EMPTY);

        BUTTON.setMinSize(width, HEIGHT);
        BUTTON.setOpacity(OPACITY);
        BUTTON.setFocusTraversable(false);

        this.setAlignment(Pos.BOTTOM_CENTER);
        StackPane.setMargin(LABEL, new Insets(0,0,5,0));
        this.getChildren().addAll(IMAGE_VIEW, LABEL, BUTTON);
    }
}
