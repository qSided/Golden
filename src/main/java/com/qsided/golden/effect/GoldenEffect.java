package com.qsided.golden.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GoldenEffect extends MobEffect {

    protected GoldenEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @SubscribeEvent
    public void onXPDrop(LivingExperienceDropEvent event) {
        Player player = event.getAttackingPlayer();
        if (player.hasEffect(ModEffects.GOLDEN.get())) {
            event.setDroppedExperience(event.getDroppedExperience() * player.getEffect(ModEffects.GOLDEN.get()).getAmplifier());
        }
    }
}
