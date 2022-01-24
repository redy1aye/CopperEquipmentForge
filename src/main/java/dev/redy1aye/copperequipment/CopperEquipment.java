package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.misc.Config;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("copperequipment")
public class CopperEquipment {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "copperequipment";

    public CopperEquipment() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.ITEMS.register(bus);
        Blocks.BLOCKS.register(bus);

        // ModLoadingContext.get().registerConfig(Type.COMMON, Config.CE_CFG, "copperequipment-common.toml");
        MinecraftForge.EVENT_BUS.register(this);
    }
}