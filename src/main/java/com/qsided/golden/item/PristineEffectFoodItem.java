package com.qsided.golden.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PristineEffectFoodItem extends Item {

    public PristineEffectFoodItem(Properties pProperties) {
        super(pProperties);
    }


    public static final FoodProperties PRISTINE_GOLDEN_BAKED_POTATO = new FoodProperties.Builder().nutrition(6).saturationMod(1.4f).build();

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        Player pPlayer = (Player) pLivingEntity;
        pPlayer.setAbsorptionAmount(6);
        pPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1), pPlayer);
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }

    @Override
    public boolean isEdible() {
        return true;
    }
}
