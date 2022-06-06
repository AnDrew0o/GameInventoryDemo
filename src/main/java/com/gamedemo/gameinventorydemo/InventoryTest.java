package com.gamedemo.gameinventorydemo;

public class InventoryTest extends Inventory {

    public InventoryTest(TransitItemCell transitCell) {
        super(transitCell);
    }

    @Override
    protected void initializeItemCells() {
        itemCells.add(new ItemCellLarge(transitCell));

        for (int i = 0; i < 10; i++) {
            itemCells.add(new ItemCellMedium(transitCell));
        }

        for (int i = 0; i < 8; i++) {
            itemCells.add(new ItemCellSmall(transitCell));
        }
    }
}
