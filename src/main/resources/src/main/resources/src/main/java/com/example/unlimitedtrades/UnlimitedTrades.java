package com.example.unlimitedtrades;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnlimitedTrades implements DedicatedServerModInitializer {
    public static final String MOD_ID = "unlimitedtrades";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeServer() {
        LOGGER.info("Unlimited Trades fuer Zielspieler wurde auf dem Server geladen!");
    }
}
