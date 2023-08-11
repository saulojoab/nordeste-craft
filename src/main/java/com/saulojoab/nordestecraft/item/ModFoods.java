package com.saulojoab.nordestecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModFoods {
    public static final FoodProperties Cuscuz = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    public static final FoodProperties Tapioca = new FoodProperties.Builder().nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties BaiaoDeDois = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    public static final FoodProperties Rapadura = new FoodProperties.Builder().nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties Caju = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build();

}
