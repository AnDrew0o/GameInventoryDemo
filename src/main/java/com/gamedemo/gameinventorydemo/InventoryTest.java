package com.gamedemo.gameinventorydemo;

import javafx.scene.Group;
import javafx.scene.control.Accordion;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class InventoryTest extends ScrollPane {

    List<ItemCell> itemCells = new ArrayList<>();

    FlowPane flowPane = new FlowPane();
    Accordion accordion = new Accordion();
    Group group = new Group(flowPane, accordion);

    public InventoryTest(TransitItemCell transitCell) {
        this.setMinWidth(425);
        this.setContent(group);

        flowPane.setMinWidth(410);

        itemCells.add(new ItemCellLarge(transitCell));

        for (int i = 0; i < 10; i++) {
            itemCells.add(new ItemCellMedium(transitCell));
        }

        for (int i = 0; i < 12; i++) {
            itemCells.add(new ItemCellSmall(transitCell));
        }

        for (ItemCell itemCell : itemCells) {
            flowPane.getChildren().add(itemCell);
        }
    }
}
