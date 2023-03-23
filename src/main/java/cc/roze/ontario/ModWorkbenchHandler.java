package cc.roze.ontario;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import static cc.roze.ontario.blocks.OntarioBlocks.*;


public class ModWorkbenchHandler extends CraftingScreenHandler {
    private final ScreenHandlerContext context;

    public ModWorkbenchHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(syncId, playerInventory, ScreenHandlerContext.EMPTY);
        this.context = context;
    }

    public boolean canUse(PlayerEntity player) {
        return canUse(this.context, player, WORKBENCH);
    }
}
