package com.gamedemo.gameinventorydemo;

public class InventoryCreative extends Inventory {

    public InventoryCreative(TransitItemCell transitCell) {
        super(transitCell);
    }

    @Override
    protected void initializeItemCells() {
        for (Item item : ItemPreparation.itemsL) {
            ItemCell itemCell = new ItemCellLarge(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
        for (Item item : ItemPreparation.itemsS) {
            ItemCell itemCell = new ItemCellSmall(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
        for (Item item : ItemPreparation.itemsM) {
            ItemCell itemCell = new ItemCellMedium(transitCell);
            itemCell.setItem(item);
            itemCells.add(itemCell);
        }
    }
}
