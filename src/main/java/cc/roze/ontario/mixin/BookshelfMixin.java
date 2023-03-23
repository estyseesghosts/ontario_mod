package cc.roze.ontario.mixin;

import net.minecraft.block.Blocks;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static cc.roze.ontario.blocks.OntarioBlocks.*;

@Mixin(EnchantingTableBlock.class)
abstract class BookshelfMixin {
    @Inject(method = "canAccessBookshelf(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Z",
    at = @At("TAIL"),
    cancellable = true)

    private static void injected(World world, BlockPos tablePos, BlockPos bookshelfOffset, CallbackInfoReturnable<Boolean> cir)
    {
        boolean isBookshelf = false;

        if        (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Blocks.BOOKSHELF)) isBookshelf = true;
        else if   (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(ACACIA_BOOKSHELF)) isBookshelf = true;
        else if    (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(BIRCH_BOOKSHELF)) isBookshelf = true;
        else if   (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(SPRUCE_BOOKSHELF)) isBookshelf = true;
        else if   (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(JUNGLE_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(DARK_OAK_BOOKSHELF)) isBookshelf = true;
        else if  (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CRIMSON_BOOKSHELF)) isBookshelf = true;
        else if   (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(WARPED_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(MANGROVE_BOOKSHELF)) isBookshelf = true;

        cir.setReturnValue(isBookshelf && world.isAir(tablePos.add(bookshelfOffset.getX() / 2, bookshelfOffset.getY(), bookshelfOffset.getZ() / 2)));
    }
}

