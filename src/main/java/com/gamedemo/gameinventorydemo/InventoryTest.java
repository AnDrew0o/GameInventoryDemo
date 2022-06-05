package com.gamedemo.gameinventorydemo;

public class InventoryTest extends Inventory {

    public InventoryTest(TransitItemCell transitCell) {
        super(transitCell);
    }

    @Override
    public void initializeItemCells() {
        itemCells.add(new ItemCellLarge(transitCell));

        for (int i = 0; i < 9; i++) {
            itemCells.add(new ItemCellMedium(transitCell));
        }

        itemCells.add(new ItemCellLarge(transitCell));
        itemCells.add(new ItemCellLarge(transitCell));

        for (int i = 0; i < 13; i++) {
            itemCells.add(new ItemCellSmall(transitCell));
        }
        for (int i = 0; i < 5; i++) {
            itemCells.add(new ItemCellMedium(transitCell));
        }
    }
}
