/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2016 minecraft-dev
 *
 * MIT License
 */

package com.demonwav.mcdev.platform.mcp;

import java.io.File;
import java.util.Set;

public interface MinecraftDevModel {
    Set<File> getMappingFiles();

    String getMinecraftVersion();

    String getMcpVersion();
}
