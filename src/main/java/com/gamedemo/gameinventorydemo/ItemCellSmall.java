package com.gamedemo.gameinventorydemo;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;

public class ItemCellSmall extends ItemCell {

    private Item item;
    private Size containItemSize = Size.SMALL;

    Button button = new Button();
    ImageView imageView = new ImageView();
    Label label = new Label();

    private final String EMPTY = "empty";
    private final int WIDTH = 50;
    private final int HEIGHT = 100;
    private final double OPACITY = 0;

    TransitItemCell transitCell;

    public ItemCellSmall(TransitItemCell transitCell) {
        super();
        this.transitCell = transitCell;
        applyView();
        applyAction();
    }

    @Override
    public void setItem(Item item) {
        this.item = item;
        if (item != null) {
            this.imageView.setImage(item.getImage());
            this.label.setText(item.getName());
        } else {
            this.imageView.setImage(null);
            this.label.setText(EMPTY);
        }
    }

    void applyAction() {
        button.setOnAction(e -> {
            if (item == null && transitCell.getItem() != null && transitCell.getItem().getSize() == containItemSize) {
                this.setItem(transitCell.getItem());
                transitCell.setItem(null);

                System.out.println("null <> item");
            } else if (transitCell.getItem() == null && item != null) {
                transitCell.setItem(item);
                this.setItem(null);

                System.out.println("item <> null");
            }
            else if (transitCell.getItem() != item && transitCell.getItem().getSize() == containItemSize) {
                Item tempItem = item;
                this.setItem(transitCell.getItem());
                transitCell.setItem(tempItem);

                System.out.println("item <> item");
            }
        });
    }

    void applyView() {
        this.setBackground(new Background(new BackgroundImage(GameMainWindow.cell_B_G_S,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                null, null)));
        label.setText(EMPTY);

        imageView.setFitWidth(WIDTH);
        imageView.setFitHeight(HEIGHT);

        button.setMinSize(WIDTH, HEIGHT);
        button.setOpacity(OPACITY);

        this.getChildren().addAll(imageView, label, button);
    }
}
