/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2016 minecraft-dev
 *
 * MIT License
 */

package com.demonwav.mcdev.platform.bukkit;

import com.demonwav.mcdev.asset.PlatformAssets;
import com.demonwav.mcdev.insight.generation.ui.EventGenerationPanel;
import com.demonwav.mcdev.platform.AbstractModuleType;
import com.demonwav.mcdev.platform.PlatformType;
import com.demonwav.mcdev.platform.bukkit.generation.BukkitEventGenerationPanel;
import com.demonwav.mcdev.platform.bukkit.util.BukkitConstants;
import com.demonwav.mcdev.util.CommonColors;

import com.google.common.collect.ImmutableList;
import com.intellij.openapi.module.Module;
import com.intellij.psi.PsiClass;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import javax.swing.Icon;

public class BukkitModuleType extends AbstractModuleType<BukkitModule<?>> {

    private static final BukkitModuleType instance = new BukkitModuleType();

    private static final String ID = "BUKKIT_MODULE_TYPE";
    private static final List<String> IGNORED_ANNOTATIONS = ImmutableList.of(BukkitConstants.HANDLER_ANNOTATION);
    private static final List<String> LISTENER_ANNOTATIONS = ImmutableList.of(BukkitConstants.HANDLER_ANNOTATION);

    private BukkitModuleType() {
        this("org.bukkit", "bukkit");
    }

    protected BukkitModuleType(final String groupId, final String artifactId) {
        super(groupId, artifactId);
        CommonColors.applyStandardColors(this.colorMap, BukkitConstants.CHAT_COLOR_CLASS);
    }

    @NotNull
    public static BukkitModuleType getInstance() {
        return instance;
    }

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.BUKKIT;
    }

    @Override
    public Icon getIcon() {
        return PlatformAssets.BUKKIT_ICON;
    }

    public String getId() {
        return ID;
    }

    @NotNull
    @Override
    public List<String> getIgnoredAnnotations() {
        return IGNORED_ANNOTATIONS;
    }

    @NotNull
    @Override
    public List<String> getListenerAnnotations() {
        return LISTENER_ANNOTATIONS;
    }

    @NotNull
    @Override
    public BukkitModule generateModule(Module module) {
        return new BukkitModule<>(module, this);
    }

    @Contract(pure = true)
    @Override
    public boolean isEventGenAvailable() {
        return true;
    }

    @NotNull
    @Override
    public EventGenerationPanel getEventGenerationPanel(@NotNull PsiClass chosenClass) {
        return new BukkitEventGenerationPanel(chosenClass);
    }
}
