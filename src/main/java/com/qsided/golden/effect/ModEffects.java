package com.qsided.golden.effect;

import com.qsided.golden.GoldenMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GoldenMod.MODID);

    public static final RegistryObject<MobEffect> EXP_BOOST = MOB_EFFECTS.register("exp_boost",
            () -> new GoldenEffect(MobEffectCategory.BENEFICIAL, 15588646));

    public static void register(IEventBus event) {
        MOB_EFFECTS.register(event);
    }

}
