package com.qsided.golden.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GoldenStewItem extends Item {
    public static final FoodProperties GOLDEN_BEETROOT_STEW = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();

    public GoldenStewItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    @Override
    public boolean isPiglinCurrency(ItemStack stack) {
        return true;
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}
