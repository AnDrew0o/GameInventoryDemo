package com.gamedemo.gameinventorydemo;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class ItemCellMedium extends ItemCell {

    private Item item;

    Button button = new Button();
    ImageView imageView = new ImageView();
    Label label = new Label();

    private String empty = "empty";
    private final int WIDTH = 100;
    private final int HEIGHT = 100;
    private final double OPACITY = 0;

    TransitItemCell transitCell;
    private Size containItemSize = Size.MEDIUM;

    public ItemCellMedium(TransitItemCell transitCell) {
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
            this.label.setText(empty);
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
        this.setBackground(new Background(new BackgroundImage(GameMainWindow.cell_B_G_M, null, null, null, null)));
        label.setText(empty);
//        label.setTextFill(Color.WHITE);

        imageView.setFitWidth(WIDTH);
        imageView.setFitHeight(HEIGHT);

        button.setMinSize(WIDTH, HEIGHT);
        button.setOpacity(OPACITY);

        this.getChildren().addAll(imageView, label, button);
    }
}
