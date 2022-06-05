package com.gamedemo.gameinventorydemo;

import javafx.scene.Group;
import javafx.scene.control.Accordion;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.List;

public abstract class Inventory extends ScrollPane {

    List<ItemCell> itemCells = new ArrayList<>();

    FlowPane flowPane = new FlowPane();
    Accordion accordion = new Accordion();
    Group group = new Group(flowPane, accordion);
    TransitItemCell transitCell;

    public Inventory(TransitItemCell transitCell) {
        this.transitCell = transitCell;
        this.setHbarPolicy(ScrollBarPolicy.NEVER);
        this.setVbarPolicy(ScrollBarPolicy.NEVER);
        this.setMinWidth(400);
        flowPane.setMinWidth(400);
        this.setContent(group);

        initializeItemCells();

        for (ItemCell itemCell : itemCells) {
            flowPane.getChildren().add(itemCell);
        }
    }

    public abstract void initializeItemCells();
}
