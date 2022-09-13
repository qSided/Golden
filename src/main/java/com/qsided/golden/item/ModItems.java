package com.qsided.golden.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.qsided.golden.GoldenMod.MODID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    //Main golden food items -----------------------------------------------------------------------------------------------------
    public static final RegistryObject<Item> GOLDEN_POTATO = ITEMS.register("golden_potato", ()
            -> new GoldenFoodItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(GoldenFoodItem.GOLDEN_POTATO)));
    public static final RegistryObject<Item> GOLDEN_BAKED_POTATO = ITEMS.register("golden_baked_potato", ()
            -> new GoldenFoodItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(GoldenFoodItem.GOLDEN_BAKED_POTATO)));
    public static final RegistryObject<Item> GOLDEN_BEETROOT = ITEMS.register("golden_beetroot", ()
            -> new GoldenFoodItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(GoldenFoodItem.GOLDEN_BEETROOT)));

    //Stews ----------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Item> GOLDEN_BEETROOT_STEW = ITEMS.register("golden_beetroot_stew", ()
            -> new GoldenStewItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(GoldenStewItem.GOLDEN_BEETROOT_STEW)));

    //Baked potato toppings ------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Item> SOUR_CREAM_CLOSED = ITEMS.register("sour_cream_closed", ()
            -> new ToppingItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> SOUR_CREAM_OPENED = ITEMS.register("sour_cream_opened", ()
            -> new ToppingItem(new Item.Properties()));
    public static final RegistryObject<Item> BACON_BITS_CLOSED = ITEMS.register("bacon_bits_closed", ()
            -> new ToppingItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> BACON_BITS_OPENED = ITEMS.register("bacon_bits_opened", ()
            -> new ToppingItem(new Item.Properties()));

    //Enchanted food items -------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Item> PRISTINE_GOLDEN_POTATO = ITEMS.register("pristine_golden_potato", ()
            -> new PristineFoodItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(PristineFoodItem.PRISTINE_GOLDEN_POTATO)));
    public static final RegistryObject<Item> PRISTINE_GOLDEN_BAKED_POTATO = ITEMS.register("pristine_golden_baked_potato", ()
            -> new PristineEffectFoodItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(PristineEffectFoodItem.PRISTINE_GOLDEN_BAKED_POTATO)));
}
