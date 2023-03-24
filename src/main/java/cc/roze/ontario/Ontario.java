package cc.roze.ontario;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
//import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static cc.roze.ontario.blocks.OntarioBlocks.*;
import static cc.roze.ontario.blocks.OntarioBlocks.ANDESITE_BRICK_SLAB;

public class Ontario implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID = "ontario";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		BlockRenderLayerMap.INSTANCE.putBlock(WORKBENCH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(IRON_LADDER, RenderLayer.getCutout());

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registries.BLOCK, new Identifier("ontario", "andesite_tile"), ANDESITE_TILE);
		Registry.register(Registries.ITEM, new Identifier("ontario", "andesite_tile"), new BlockItem(ANDESITE_TILE, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "diorite_tile"), DIORITE_TILE);
		Registry.register(Registries.ITEM, new Identifier("ontario", "diorite_tile"), new BlockItem(DIORITE_TILE, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "granite_tile"), GRANITE_TILE);
		Registry.register(Registries.ITEM, new Identifier("ontario", "granite_tile"), new BlockItem(GRANITE_TILE, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "quartz_tile"), QUARTZ_TILE);
		Registry.register(Registries.ITEM, new Identifier("ontario", "quartz_tile"), new BlockItem(QUARTZ_TILE, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "calcite_coal_tile"), CALCITE_COAL_TILE);
		Registry.register(Registries.ITEM, new Identifier("ontario", "calcite_coal_tile"), new BlockItem(CALCITE_COAL_TILE, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "calcite_bricks"), CALCITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "calcite_bricks"), new BlockItem(CALCITE_BRICKS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "fake_bedrock"), FAKE_BEDROCK);
		Registry.register(Registries.ITEM, new Identifier("ontario", "fake_bedrock"), new BlockItem(FAKE_BEDROCK, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "acacia_bookshelf"), ACACIA_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "acacia_bookshelf"), new BlockItem(ACACIA_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "birch_bookshelf"), BIRCH_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "birch_bookshelf"), new BlockItem(BIRCH_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "spruce_bookshelf"), SPRUCE_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "spruce_bookshelf"), new BlockItem(SPRUCE_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "mangrove_bookshelf"), MANGROVE_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "mangrove_bookshelf"), new BlockItem(MANGROVE_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "dark_oak_bookshelf"), DARK_OAK_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "dark_oak_bookshelf"), new BlockItem(DARK_OAK_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "crimson_bookshelf"), CRIMSON_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "crimson_bookshelf"), new BlockItem(CRIMSON_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "warped_bookshelf"), WARPED_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "warped_bookshelf"), new BlockItem(WARPED_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "jungle_bookshelf"), JUNGLE_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "jungle_bookshelf"), new BlockItem(JUNGLE_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "cherry_bookshelf"), CHERRY_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "cherry_bookshelf"), new BlockItem(CHERRY_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bamboo_bookshelf"), BAMBOO_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bamboo_bookshelf"), new BlockItem(BAMBOO_BOOKSHELF, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "diorite_bricks"), DIORITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "andesite_bricks"), ANDESITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "granite_bricks"), GRANITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "granite_bricks"), new BlockItem(GRANITE_BRICKS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "iron_ladder"), IRON_LADDER);
		Registry.register(Registries.ITEM, new Identifier("ontario", "iron_ladder"), new BlockItem(IRON_LADDER, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "diorite_tiled_stairs"), DIORITE_TILED_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "diorite_tiled_stairs"), new BlockItem(DIORITE_TILED_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "diorite_tiled_slab"), DIORITE_TILED_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "diorite_tiled_slab"), new BlockItem(DIORITE_TILED_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "granite_tiled_stairs"), GRANITE_TILED_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "granite_tiled_stairs"), new BlockItem(GRANITE_TILED_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "granite_tiled_slab"), GRANITE_TILED_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "granite_tiled_slab"), new BlockItem(GRANITE_TILED_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "andesite_tiled_stairs"), ANDESITE_TILED_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "andesite_tiled_stairs"), new BlockItem(ANDESITE_TILED_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "andesite_tiled_slab"), ANDESITE_TILED_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "andesite_tiled_slab"), new BlockItem(ANDESITE_TILED_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "workbench"), WORKBENCH);
		Registry.register(Registries.ITEM, new Identifier("ontario", "workbench"), new BlockItem(WORKBENCH, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "diorite_brick_stairs"), DIORITE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "diorite_brick_stairs"), new BlockItem(DIORITE_BRICK_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "diorite_brick_slab"), DIORITE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "diorite_brick_slab"), new BlockItem(DIORITE_BRICK_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "granite_brick_stairs"), GRANITE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "granite_brick_stairs"), new BlockItem(GRANITE_BRICK_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "granite_brick_slab"), GRANITE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "granite_brick_slab"), new BlockItem(GRANITE_BRICK_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "andesite_brick_stairs"), ANDESITE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "andesite_brick_stairs"), new BlockItem(ANDESITE_BRICK_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "andesite_brick_slab"), ANDESITE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "andesite_brick_slab"), new BlockItem(ANDESITE_BRICK_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_2"), BRICKS_2);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_2"), new BlockItem(BRICKS_2, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_3"), BRICKS_3);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_3"), new BlockItem(BRICKS_3, new FabricItemSettings()));
		
		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_4"), BRICKS_4);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_4"), new BlockItem(BRICKS_4, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_2_stairs"), BRICKS_2_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_2_stairs"), new BlockItem(BRICKS_2_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_2_slab"), BRICKS_2_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_2_slab"), new BlockItem(BRICKS_2_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_3_stairs"), BRICKS_3_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_3_stairs"), new BlockItem(BRICKS_3_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_3_slab"), BRICKS_3_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_3_slab"), new BlockItem(BRICKS_3_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_4_stairs"), BRICKS_4_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_4_stairs"), new BlockItem(BRICKS_4_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "bricks_4_slab"), BRICKS_4_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "bricks_4_slab"), new BlockItem(BRICKS_4_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "polished_calcite"), POLISHED_CALCITE);
		Registry.register(Registries.ITEM, new Identifier("ontario", "polished_calcite"), new BlockItem(POLISHED_CALCITE, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "stone_bricks_2_stairs"), STONE_BRICKS_2_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ontario", "stone_bricks_2_stairs"), new BlockItem(STONE_BRICKS_2_STAIRS, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "stone_bricks_2_slab"), STONE_BRICKS_2_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ontario", "stone_bricks_2_slab"), new BlockItem(STONE_BRICKS_2_SLAB, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("ontario", "stone_bricks_2"), STONE_BRICKS_2);
		Registry.register(Registries.ITEM, new Identifier("ontario", "stone_bricks_2"), new BlockItem(STONE_BRICKS_2, new FabricItemSettings()));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((content) -> {
			content.addAfter(Blocks.BOOKSHELF, SPRUCE_BOOKSHELF, BIRCH_BOOKSHELF, JUNGLE_BOOKSHELF, ACACIA_BOOKSHELF, DARK_OAK_BOOKSHELF, MANGROVE_BOOKSHELF, CHERRY_BOOKSHELF, BAMBOO_BOOKSHELF, CRIMSON_BOOKSHELF, WARPED_BOOKSHELF);
			content.addAfter(Blocks.CRAFTING_TABLE, WORKBENCH);
			content.addAfter(Blocks.LADDER, IRON_LADDER);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((content) -> {
			content.addAfter(Blocks.POLISHED_ANDESITE_SLAB, ANDESITE_TILE, ANDESITE_TILED_STAIRS, ANDESITE_TILED_SLAB, ANDESITE_BRICKS, ANDESITE_BRICK_STAIRS, ANDESITE_BRICK_SLAB);
			content.addAfter(Blocks.POLISHED_DIORITE_SLAB, DIORITE_TILE, DIORITE_TILED_STAIRS, DIORITE_TILED_SLAB, DIORITE_BRICKS, DIORITE_BRICK_STAIRS, DIORITE_BRICK_SLAB);
			content.addAfter(Blocks.POLISHED_GRANITE_SLAB, GRANITE_TILE, GRANITE_TILED_STAIRS, GRANITE_TILED_SLAB, GRANITE_BRICKS, GRANITE_BRICK_STAIRS, GRANITE_BRICK_SLAB);
			
			content.addAfter(Blocks.CHISELED_QUARTZ_BLOCK, QUARTZ_TILE);
			content.addAfter(Blocks.SMOOTH_QUARTZ_SLAB, CALCITE_BRICKS, CALCITE_COAL_TILE, POLISHED_CALCITE);

			content.addAfter(Blocks.BRICKS, BRICKS_2, BRICKS_3, BRICKS_4);
			content.addAfter(Blocks.BRICK_STAIRS, BRICKS_2_STAIRS, BRICKS_3_STAIRS, BRICKS_4_STAIRS);
			content.addAfter(Blocks.BRICK_SLAB, BRICKS_2_SLAB, BRICKS_3_SLAB, BRICKS_4_SLAB);

			content.addAfter(Blocks.STONE_BRICKS, STONE_BRICKS_2);
			content.addAfter(Blocks.STONE_BRICK_STAIRS, STONE_BRICKS_2_STAIRS);
			content.addAfter(Blocks.STONE_BRICK_SLAB, STONE_BRICKS_2_SLAB);

			content.add(FAKE_BEDROCK);
		});
	}
}
