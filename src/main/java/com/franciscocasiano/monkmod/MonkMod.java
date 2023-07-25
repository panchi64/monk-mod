package com.franciscocasiano.monkmod;

import com.franciscocasiano.monkmod.item.QuarterstaffItem;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonkMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("monk_mod");

//	Items:
//	- Weapons
    public static final SwordItem QUARTERSTAFF = Registry.register(
			Registry.ITEM,
			new Identifier("monk_mod", "quarterstaff"),
			new SwordItem(QuarterstaffItem.INSTANCE, 3, 0F, new FabricItemSettings().group(ItemGroup.COMBAT))
	);


	public static final Item THROWING_STAR = Registry.register(
			Registry.ITEM,
			new Identifier("monk_mod", "throwing_star"),
			new Item(new FabricItemSettings())
	);

	public static final Item NUNCHUCK = Registry.register(
			Registry.ITEM,
			new Identifier("monk_mod", "nunchuck"),
			new Item(new FabricItemSettings())
	);

	public static final Item HAND_WRAPS = Registry.register(
			Registry.ITEM,
			new Identifier("monk_mod", "hand_wraps"),
			new Item(new FabricItemSettings())
	);

	public static final Item ROPE_DART = Registry.register(
			Registry.ITEM,
			new Identifier("monk_mod", "rope_dart"),
			new Item(new FabricItemSettings())
	);

	public static final Item BLOWGUN = Registry.register(
			Registry.ITEM,
			new Identifier("monk_mod", "blowgun"),
			new Item(new FabricItemSettings())
	);

	public static final Item DART = Registry.register(
			Registry.ITEM,
			new Identifier("monk_mod", "dart"),
			new Item(new FabricItemSettings())
	);

	@Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Monk mod has initialized - \"Awake, embrace now's gift.\"");
    }
}