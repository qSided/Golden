package com.qsided.golden.potion;

import com.qsided.golden.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.qsided.golden.GoldenMod.MODID;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, MODID);

    public static RegistryObject<Potion> GOLDEN_POTION = POTIONS.register("golden_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.GOLDEN.get(), 200, 0)));

    public static void register(IEventBus event) {
        POTIONS.register(event);
    }

}
