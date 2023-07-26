package com.franciscocasiano.monkmod;

import com.franciscocasiano.monkmod.entity.ThrowingStarEntity;
import com.franciscocasiano.monkmod.item.QuarterstaffItem;
import com.franciscocasiano.monkmod.item.ThrowingStarItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonkMod implements ModInitializer {
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
			ThrowingStarItem.INSTANCE
	);
	public static final EntityType<ThrowingStarEntity> THROWING_STAR_ENTITY = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("monk_mod", "throwing_star_entity"),
			FabricEntityTypeBuilder.<ThrowingStarEntity>create(SpawnGroup.MISC, ThrowingStarEntity::new)
					.dimensions(EntityDimensions.fixed(0.25F, 0.25F))
					.trackRangeBlocks(64).trackedUpdateRate(10)
					.build()
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

		LOGGER.info("Monk mod has initialized - \"Awake, embrace now's gift.\"");


	}
}