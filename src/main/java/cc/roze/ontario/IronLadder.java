package cc.roze.ontario;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IronLadder {
    public static final TagKey<Block> CLIMBABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier("ontario", "climbable"));
}
