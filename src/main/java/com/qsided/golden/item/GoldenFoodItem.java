package com.qsided.golden.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GoldenFoodItem extends Item {
    public static final FoodProperties GOLDEN_POTATO = new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build();
    public static final FoodProperties GOLDEN_BAKED_POTATO = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties GOLDEN_BEETROOT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build();

    public GoldenFoodItem(Properties pProperties) {
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
}
