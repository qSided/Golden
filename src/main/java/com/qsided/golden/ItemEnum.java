package com.qsided.golden;

import net.minecraft.world.item.Item;

import static com.qsided.golden.item.ModItems.*;

public enum ItemEnum {
    //Values
    SOUR_CREAM(SOUR_CREAM_CLOSED.get(), SOUR_CREAM_OPENED.get()),
    BACON_BITS(BACON_BITS_CLOSED.get(), BACON_BITS_OPENED.get())
    ;

    //The rest
    private final Item closedItem;
    private final Item openedItem;

    ItemEnum(Item closedItem, Item openedItem) {
        this.closedItem = closedItem;
        this.openedItem = openedItem;
    }

    public Item getClosedItem() {
        return closedItem;
    }

    public Item getOpenedItem() {
        return openedItem;
    }
}
