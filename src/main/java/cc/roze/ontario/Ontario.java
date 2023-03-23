package cc.roze.ontario;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static cc.roze.ontario.blocks.OntarioBlocks.*;

public class Ontario implements ModInitializer {
	public static String MOD_ID = "ontario";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
					new Identifier("ontario", "blocks"))
			.icon(() -> new ItemStack(Blocks.STONE))
			.build();

	@Override
	public void onInitialize() {
		BlockRenderLayerMap.INSTANCE.putBlock(WORKBENCH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(IRON_LADDER, RenderLayer.getCutout());

		LOGGER.info("Hello Fabric world!");
		Registry.register(Registry.BLOCK, new Identifier("ontario", "andesite_tile"), ANDESITE_TILE);
		Registry.register(Registry.ITEM, new Identifier("ontario", "andesite_tile"), new BlockItem(ANDESITE_TILE, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "diorite_tile"), DIORITE_TILE);
		Registry.register(Registry.ITEM, new Identifier("ontario", "diorite_tile"), new BlockItem(DIORITE_TILE, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "granite_tile"), GRANITE_TILE);
		Registry.register(Registry.ITEM, new Identifier("ontario", "granite_tile"), new BlockItem(GRANITE_TILE, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "quartz_tile"), QUARTZ_TILE);
		Registry.register(Registry.ITEM, new Identifier("ontario", "quartz_tile"), new BlockItem(QUARTZ_TILE, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "calcite_coal_tile"), CALCITE_COAL_TILE);
		Registry.register(Registry.ITEM, new Identifier("ontario", "calcite_coal_tile"), new BlockItem(CALCITE_COAL_TILE, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "calcite_bricks"), CALCITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "calcite_bricks"), new BlockItem(CALCITE_BRICKS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "fake_bedrock"), FAKE_BEDROCK);
		Registry.register(Registry.ITEM, new Identifier("ontario", "fake_bedrock"), new BlockItem(FAKE_BEDROCK, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "acacia_bookshelf"), ACACIA_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "acacia_bookshelf"), new BlockItem(ACACIA_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "birch_bookshelf"), BIRCH_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "birch_bookshelf"), new BlockItem(BIRCH_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "spruce_bookshelf"), SPRUCE_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "spruce_bookshelf"), new BlockItem(SPRUCE_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "mangrove_bookshelf"), MANGROVE_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "mangrove_bookshelf"), new BlockItem(MANGROVE_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "dark_oak_bookshelf"), DARK_OAK_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "dark_oak_bookshelf"), new BlockItem(DARK_OAK_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "crimson_bookshelf"), CRIMSON_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "crimson_bookshelf"), new BlockItem(CRIMSON_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "warped_bookshelf"), WARPED_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "warped_bookshelf"), new BlockItem(WARPED_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "jungle_bookshelf"), JUNGLE_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier("ontario", "jungle_bookshelf"), new BlockItem(JUNGLE_BOOKSHELF, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "diorite_bricks"), DIORITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "andesite_bricks"), ANDESITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "granite_bricks"), GRANITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "granite_bricks"), new BlockItem(GRANITE_BRICKS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "iron_ladder"), IRON_LADDER);
		Registry.register(Registry.ITEM, new Identifier("ontario", "iron_ladder"), new BlockItem(IRON_LADDER, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "diorite_tiled_stairs"), DIORITE_TILED_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "diorite_tiled_stairs"), new BlockItem(DIORITE_TILED_STAIRS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "diorite_tiled_slab"), DIORITE_TILED_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ontario", "diorite_tiled_slab"), new BlockItem(DIORITE_TILED_SLAB, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "granite_tiled_stairs"), GRANITE_TILED_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "granite_tiled_stairs"), new BlockItem(GRANITE_TILED_STAIRS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "granite_tiled_slab"), GRANITE_TILED_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ontario", "granite_tiled_slab"), new BlockItem(GRANITE_TILED_SLAB, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "andesite_tiled_stairs"), ANDESITE_TILED_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "andesite_tiled_stairs"), new BlockItem(ANDESITE_TILED_STAIRS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "andesite_tiled_slab"), ANDESITE_TILED_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ontario", "andesite_tiled_slab"), new BlockItem(ANDESITE_TILED_SLAB, new FabricItemSettings().group(OTHER_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier("ontario", "diorite_brick_stairs"), DIORITE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "diorite_brick_stairs"), new BlockItem(DIORITE_BRICK_STAIRS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "diorite_brick_slab"), DIORITE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ontario", "diorite_brick_slab"), new BlockItem(DIORITE_BRICK_SLAB, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "granite_brick_stairs"), GRANITE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "granite_brick_stairs"), new BlockItem(GRANITE_BRICK_STAIRS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "granite_brick_slab"), GRANITE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ontario", "granite_brick_slab"), new BlockItem(GRANITE_BRICK_SLAB, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "andesite_brick_stairs"), ANDESITE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ontario", "andesite_brick_stairs"), new BlockItem(ANDESITE_BRICK_STAIRS, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "andesite_brick_slab"), ANDESITE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ontario", "andesite_brick_slab"), new BlockItem(ANDESITE_BRICK_SLAB, new FabricItemSettings().group(OTHER_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("ontario", "workbench"), WORKBENCH);
		Registry.register(Registry.ITEM, new Identifier("ontario", "workbench"), new BlockItem(WORKBENCH, new FabricItemSettings().group(OTHER_GROUP)));

	}
}
