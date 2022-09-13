package com.qsided.golden.item;

import com.qsided.golden.ItemEnum;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ToppingItem extends Item {
    public ToppingItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        for (ItemEnum item : ItemEnum.values()) {
            if (pPlayer.getItemInHand(pUsedHand).is(item.getClosedItem())) {
                pPlayer.setItemInHand(pUsedHand, new ItemStack(item.getOpenedItem()));
            }
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public boolean isEdible() {
        return false;
    }
}
