package com.alessiodp.parties.bukkit.bootstrap;

import com.alessiodp.core.bukkit.bootstrap.ADPBukkitBootstrap;
import com.alessiodp.parties.bukkit.BukkitPartiesPlugin;

public class BukkitPartiesBootstrap extends ADPBukkitBootstrap {
	static {
		configureSlf4jSimpleLoggerDefaults();
	}

	public BukkitPartiesBootstrap() {
		plugin = new BukkitPartiesPlugin(this);
	}

	private static void configureSlf4jSimpleLoggerDefaults() {
		setIfAbsent("org.slf4j.simpleLogger.logFile", "System.out");
		setIfAbsent("org.slf4j.simpleLogger.log.com.alessiodp.parties.libs.hikari", "warn");
	}

	private static void setIfAbsent(String key, String value) {
		if (System.getProperty(key) == null) {
			System.setProperty(key, value);
		}
	}
}
