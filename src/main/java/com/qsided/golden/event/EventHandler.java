package com.qsided.golden.event;

import com.qsided.golden.effect.ModEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerXpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler {

    @SubscribeEvent
    public static void onXpChange(PlayerXpEvent.XpChange event) {
        Player player = event.getEntity();
        if (player.hasEffect(ModEffects.EXP_BOOST.get())) {
            event.setAmount(event.getAmount() * (5 + (player.getEffect(ModEffects.EXP_BOOST.get()).getAmplifier() * 7)));
        }
    }
}
