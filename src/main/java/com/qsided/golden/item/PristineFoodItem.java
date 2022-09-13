package com.qsided.golden.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PristineFoodItem extends Item {

    public PristineFoodItem(Properties pProperties)
    {
        super(pProperties);
    }

    public static final FoodProperties PRISTINE_GOLDEN_POTATO = new FoodProperties.Builder().nutrition(3).saturationMod(0.4f).build();

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }

    @Override
    public boolean isEdible() {
        return true;
    }
}
