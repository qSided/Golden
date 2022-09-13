package com.qsided.golden;

import com.mojang.logging.LogUtils;
import com.qsided.golden.effect.GoldenEffect;
import com.qsided.golden.event.EventHandler;
import com.qsided.golden.item.ModItems;
import com.qsided.golden.util.BetterBrewingRecipe;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.qsided.golden.effect.ModEffects.MOB_EFFECTS;
import static com.qsided.golden.item.ModItems.*;
import static com.qsided.golden.potion.ModPotions.*;

/*
TODO Finish baked potato functionality
 */

@Mod(GoldenMod.MODID)
public class GoldenMod
{
    public static final String MODID = "golden";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GoldenMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(EventHandler.class);

        ITEMS.register(modEventBus);
        MOB_EFFECTS.register(modEventBus);
        POTIONS.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.GOLDEN_BEETROOT.get(), 0.85f);
            ComposterBlock.COMPOSTABLES.put(ModItems.GOLDEN_POTATO.get(), 0.85f);
            ComposterBlock.COMPOSTABLES.put(ModItems.GOLDEN_BAKED_POTATO.get(), 0.85f);
            ComposterBlock.COMPOSTABLES.put(ModItems.PRISTINE_GOLDEN_POTATO.get(), 0.9f);
            ComposterBlock.COMPOSTABLES.put(ModItems.PRISTINE_GOLDEN_BAKED_POTATO.get(), 0.9f);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, PRISTINE_GOLDEN_BAKED_POTATO.get(), POTION_O_GOLD_1.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(POTION_O_GOLD_1.get(), GOLDEN_BEETROOT.get(), POTION_O_GOLD_2.get()));
        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
    }

    //You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
