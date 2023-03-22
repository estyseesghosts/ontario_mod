package cc.roze.ontario.mixin;

import cc.roze.ontario.Ontario;
import net.minecraft.block.Blocks;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantingTableBlock.class)
abstract class BookshelfMixin {
//    @Redirect(method = "randomDisplayTick(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/random/Random;)V",
//            at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/block/EnchantingTableBlock;canAccessBookshelf(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Z"))

    @Inject(method = "canAccessBookshelf(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Z",
    at = @At("TAIL"),
    cancellable = true)

    private static void injected(World world, BlockPos tablePos, BlockPos bookshelfOffset, CallbackInfoReturnable<Boolean> cir)
    {
        boolean isBookshelf = false;

        if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Blocks.BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.ACACIA_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.BIRCH_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.SPRUCE_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.JUNGLE_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.DARK_OAK_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.CRIMSON_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.WARPED_BOOKSHELF)) isBookshelf = true;
        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Ontario.MANGROVE_BOOKSHELF)) isBookshelf = true;

        cir.setReturnValue(isBookshelf && world.isAir(tablePos.add(bookshelfOffset.getX() / 2, bookshelfOffset.getY(), bookshelfOffset.getZ() / 2)));
    }

//    private static boolean canAccessBookshelf(World world, BlockPos tablePos, BlockPos bookshelfOffset) {
//
//        boolean isBookshelf = false;
//
//        if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Blocks.BOOKSHELF)) isBookshelf = true;
//        else if (world.getBlockState(tablePos.add(bookshelfOffset)).isOf(ExampleMod.ACACIA_BOOKSHELF)) isBookshelf = true;
//
//        return isBookshelf && world.isAir(tablePos.add(bookshelfOffset.getX() / 2, bookshelfOffset.getY(), bookshelfOffset.getZ() / 2));
//    }
}

