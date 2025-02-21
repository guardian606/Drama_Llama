package com.Drama.drama_llama.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.level.Level;

public class CustomLlamaEntity extends Llama {
    public CustomLlamaEntity(EntityType<? extends Llama> type, Level level) {
        super(type, level);
    }
}
