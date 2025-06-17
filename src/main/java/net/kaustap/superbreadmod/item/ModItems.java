package net.kaustap.superbreadmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kaustap.superbreadmod.SuperbreadMod;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.FoodComponent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static final String SUPER_BREAD_NAME = "super_bread";
    public static final Item SUPER_BREAD = regesterItem(new Item(new Item.Settings().maxCount(16).food(
            new FoodComponent.Builder().
                    hunger(6).
                    saturationModifier(1.2f).
                    alwaysEdible().
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.REGENERATION, 20 * 3 * 60, 1), 1.0f).
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.SPEED, 20 * 3 * 60, 3), 1.0f).
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.JUMP_BOOST, 20 * 3 * 60, 3), 1.0f).
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.RESISTANCE, 20 * 3 * 60, 2), 1.0f).
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.FIRE_RESISTANCE, 20 * 3 * 60, 1), 1.0f).
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.NIGHT_VISION, 20 * 3 * 60, 1), 1.0f).
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.ABSORPTION, 20 * 3 * 60, 3), 1.0f).
                    statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                            StatusEffects.STRENGTH, 20 * 3 * 60, 2), 1.0f).
                    build())));

    private static Item regesterItem(Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SuperbreadMod.MOD_ID, SUPER_BREAD_NAME), item);
    }

    public static void registerModItems() {
        SuperbreadMod.LOGGER.info("Registering Mod items for " + SuperbreadMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> fabricItemGroupEntries.add(SUPER_BREAD));
    }
}
