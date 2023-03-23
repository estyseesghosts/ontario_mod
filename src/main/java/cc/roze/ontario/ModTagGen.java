//import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
//import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
//import net.minecraft.block.Blocks;
//import net.minecraft.item.Item;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.tag.TagKey;
//import net.minecraft.util.Identifier;
//
//import static cc.roze.ontario.blocks.OntarioBlocks.*;
//
//private static class ModTagGen extends FabricTagProvider<Item> {
//    public MyTagGenerator(FabricDataGenerator dataGenerator) {
//        super(dataGenerator, Registries.BLOCK);
//    }
//
//    private static final TagKey<Item> CAN_ENCHANT = TagKey.of(Registries.BLOCK, new Identifier("ontario:can_enchant"));
//
//    @Override
//    protected void generateTags() {
//        getOrCreateTagBuilder(CAN_ENCHANT)
//                .add(Blocks.BOOKSHELF)
//                .add(ACACIA_BOOKSHELF)
//                .add(SPRUCE_BOOKSHELF)
//                .add(MANGROVE_BOOKSHELF)
//                .add(JUNGLE_BOOKSHELF)
//                .add(DARK_OAK_BOOKSHELF)
//                .add(WARPED_BOOKSHELF)
//                .add(CRIMSON_BOOKSHELF)
//                .add(BIRCH_BOOKSHELF);
//
//    }
//}
//
//// ...
//
