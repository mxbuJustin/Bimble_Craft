package net.mxbujstn.bimble_craft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BIMBLE_APPLE = new FoodProperties.Builder().alwaysEat().nutrition(20)
            .saturationMod(20)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 5), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 100), 1.0F)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 2400, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 5), 1.0F)
            .effect(new MobEffectInstance(MobEffects.JUMP, 2400, 40), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 0), 1.0F)
            .build();
}
