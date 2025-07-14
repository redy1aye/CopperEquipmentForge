package dev.redy1aye.copperequipment;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CopperEquipment.MOD_ID)
public class CopperEquipment {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "copperequipment";

    public CopperEquipment(IEventBus modEventBus) {
        Items.ITEMS.register(modEventBus);
        CopperBlocks.BLOCKS.register(modEventBus);
        CopperEquipmentCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        LOGGER.info("Initializing Copper Equipment");
    }
}