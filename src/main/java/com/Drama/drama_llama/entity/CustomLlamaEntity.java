package com.drama.drama_llama.entity;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.level.Level;

public class CustomLlamaEntity extends Llama {
    private float speed = 1.0f;
    private int breedingSpeed = 1;
    private int growth = 1;

    public CustomLlamaEntity(EntityType<? extends Llama> type, Level level) {
        super(type, level);
    }

    @Override
    public float getSpeed() { return speed; } // Changed return type to float

    public int getBreedingSpeed() { return breedingSpeed; }
    public int getGrowth() { return growth; }

    public void increaseSpeed() { if (speed < 10.0f) speed++; }
    public void increaseBreedingSpeed() { if (breedingSpeed < 10) breedingSpeed++; }
    public void increaseGrowth() { if (growth < 10) growth++; }
}
