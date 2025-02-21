package com.drama.drama_llama.tooltip;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class LlamaTooltip {
    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        CompoundTag tag = stack.getTag(); // Get the item's NBT data

        if (tag != null && tag.contains("LlamaStats")) {
            CompoundTag stats = tag.getCompound("LlamaStats");
            int speed = stats.getInt("Speed");
            int breedingSpeed = stats.getInt("BreedingSpeed");
            int growth = stats.getInt("Growth");

            event.getToolTip().add(Component.literal("Speed: " + speed));
            event.getToolTip().add(Component.literal("Breeding Speed: " + breedingSpeed));
            event.getToolTip().add(Component.literal("Growth: " + growth));
        }
    }
}
