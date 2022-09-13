package com.qsided.golden.effect;

import com.qsided.golden.GoldenMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.core.config.plugins.convert.HexConverter;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.util.HexFormat;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GoldenMod.MODID);

    public static final RegistryObject<MobEffect> GOLDEN = MOB_EFFECTS.register("golden", () -> new GoldenEffect(MobEffectCategory.BENEFICIAL, Color.HSBtoRGB(43, 100, 56)));

    public static void register(IEventBus event) {
        MOB_EFFECTS.register(event);
    }

}
