package com.pp.brewingandbaking.worldgen;

import net.neoforged.bus.api.IEventBus;
public final class ModWorldGen {
    public static void register(IEventBus bus) {
        ModConfiguredFeatures.CONFIGURED_FEATURES.register(bus);
        ModPlacedFeatures.PLACED_FEATURES.register(bus);
    }
}
