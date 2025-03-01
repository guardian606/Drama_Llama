package com.drama.drama_llama;

import com.drama.drama_llama.registry.ModBlocks;
import com.drama.drama_llama.registry.ModEntities;
import com.drama.drama_llama.registry.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DramaLlamaMod.MOD_ID)
public class DramaLlamaMod {
    public static final String MOD_ID = "dramallama";

    public DramaLlamaMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModEntities.ENTITIES.register(bus);
        
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Common setup code
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        // Client-specific setup (like rendering entities)
    }
}