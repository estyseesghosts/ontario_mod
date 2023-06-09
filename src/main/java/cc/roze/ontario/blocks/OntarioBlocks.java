package cc.roze.ontario.blocks;

import cc.roze.ontario.ModBlockStairs;
import cc.roze.ontario.ModWorkbench;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class OntarioBlocks {
    public static final Block DIORITE_TILE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    public static final Block GRANITE_TILE = new Block(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block ANDESITE_TILE = new Block(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block QUARTZ_TILE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    public static final Block CALCITE_COAL_TILE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    public static final Block CALCITE_BRICKS = new Block(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block POLISHED_CALCITE = new Block(FabricBlockSettings.copy(DIORITE_TILE));

    public static final Block FAKE_BEDROCK = new Block(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block CHERRY_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block BAMBOO_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));

    public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block IRON_LADDER = new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).strength(1.0F).sounds(BlockSoundGroup.METAL).nonOpaque());
    public static final Block DIORITE_TILED_STAIRS = new ModBlockStairs(DIORITE_TILE.getDefaultState(), FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block DIORITE_TILED_SLAB = new SlabBlock(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block GRANITE_TILED_STAIRS = new ModBlockStairs(GRANITE_TILE.getDefaultState(), FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block GRANITE_TILED_SLAB = new SlabBlock(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block ANDESITE_TILED_STAIRS = new ModBlockStairs(ANDESITE_TILE.getDefaultState(), FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block ANDESITE_TILED_SLAB = new SlabBlock(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block WORKBENCH = new ModWorkbench(FabricBlockSettings.of(Material.WOOD).strength(2.0f).nonOpaque());

    public static final Block GRANITE_BRICK_STAIRS = new ModBlockStairs(GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block DIORITE_BRICK_STAIRS = new ModBlockStairs(DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block ANDESITE_BRICK_STAIRS = new ModBlockStairs(ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(DIORITE_TILE));
    public static final Block BRICKS_2 = new Block(FabricBlockSettings.copy(Blocks.BRICKS));
    public static final Block BRICKS_3 = new Block(FabricBlockSettings.copy(Blocks.BRICKS));
    public static final Block BRICKS_4 = new Block(FabricBlockSettings.copy(Blocks.BRICKS));
    public static final Block BRICKS_2_STAIRS = new ModBlockStairs(BRICKS_2.getDefaultState(), FabricBlockSettings.copy(BRICKS_4));
    public static final Block BRICKS_3_STAIRS = new ModBlockStairs(BRICKS_3.getDefaultState(), FabricBlockSettings.copy(BRICKS_4));
    public static final Block BRICKS_4_STAIRS = new ModBlockStairs(BRICKS_4.getDefaultState(), FabricBlockSettings.copy(BRICKS_4));
    public static final Block BRICKS_2_SLAB = new SlabBlock(FabricBlockSettings.copy(BRICKS_2));
    public static final Block BRICKS_3_SLAB = new SlabBlock(FabricBlockSettings.copy(BRICKS_2));
    public static final Block BRICKS_4_SLAB = new SlabBlock(FabricBlockSettings.copy(BRICKS_2));

    public static final Block STONE_BRICKS_2 = new Block(FabricBlockSettings.copy(Blocks.BRICKS));
    public static final Block STONE_BRICKS_2_STAIRS = new ModBlockStairs(DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BRICKS_4));
    public static final Block STONE_BRICKS_2_SLAB = new SlabBlock(FabricBlockSettings.copy(BRICKS_2));

}
