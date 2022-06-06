package com.gamedemo.gameinventorydemo;

import javafx.scene.Group;
import javafx.scene.control.Accordion;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.List;

public abstract class Inventory extends ScrollPane {

    protected List<ItemCell> itemCells = new ArrayList<>();

    protected TransitItemCell transitCell;

    protected Inventory(TransitItemCell transitCell) {
        this.transitCell = transitCell;
        this.setHbarPolicy(ScrollBarPolicy.NEVER);
        this.setVbarPolicy(ScrollBarPolicy.NEVER);
        this.setMinWidth(400);
        FlowPane flowPane = new FlowPane();
        flowPane.setMinWidth(400);
        Accordion accordion = new Accordion();
        Group group = new Group(flowPane, accordion);
        this.setContent(group);

        initializeItemCells();

        for (ItemCell itemCell : itemCells) {
            flowPane.getChildren().add(itemCell);
        }
    }

    protected abstract void initializeItemCells();
}
