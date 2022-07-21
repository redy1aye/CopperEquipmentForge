package dev.redy1aye.copperequipment;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CopperEquipment.MOD_ID)
public class CopperEquipment {

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "copperequipment";

    public CopperEquipment() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.ITEMS.register(bus);
        Blocks.BLOCKS.register(bus);

        // ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configs.SPEC, "copperequipment.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }
}
