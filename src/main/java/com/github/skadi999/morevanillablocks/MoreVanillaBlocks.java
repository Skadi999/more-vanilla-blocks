package com.github.skadi999.morevanillablocks;

import com.github.skadi999.morevanillablocks.init.ModBlocks;
import com.github.skadi999.morevanillablocks.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreVanillaBlocks.MODID)
public class MoreVanillaBlocks {
    public static final String MODID = "morevanillablocks";

    private static final Logger LOGGER = LogManager.getLogger();

    public MoreVanillaBlocks() {
        LOGGER.debug("---More Vanilla Blocks---");
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(ModEventHandler.class);
    }
}
