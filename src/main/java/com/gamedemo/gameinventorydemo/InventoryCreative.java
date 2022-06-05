package com.gamedemo.gameinventorydemo;

public class InventoryCreative extends Inventory {

    public InventoryCreative(TransitItemCell transitCell) {
        super(transitCell);
    }

    @Override
    public void initializeItemCells() {
        for (Item item : ImagePreparation.itemsS) {
            ItemCell itemCell = new ItemCellSmall(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
        for (Item item : ImagePreparation.itemsM) {
            ItemCell itemCell = new ItemCellMedium(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
        for (Item item : ImagePreparation.itemsL) {
            ItemCell itemCell = new ItemCellLarge(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
    }
}
