/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2016 minecraft-dev
 *
 * MIT License
 */

package com.demonwav.mcdev.update

import com.intellij.ide.plugins.IdeaPluginDescriptor
import com.intellij.util.text.VersionComparatorUtil

import java.io.PrintWriter
import java.io.StringWriter

open class PluginUpdateStatus private constructor() {

    fun mergeWith(other: PluginUpdateStatus): PluginUpdateStatus {
        // Jesus wept. https://github.com/JetBrains/kotlin/blob/master/idea/src/org/jetbrains/kotlin/idea/KotlinPluginUpdater.kt#L61-L63
        if (other is Update && (
            this is LatestVersionInstalled || this is Update && VersionComparatorUtil.compare(
                other.pluginDescriptor.version,
                this.pluginDescriptor.version
            ) > 0)
        ) {
            return other
        }
        return this
    }

    class LatestVersionInstalled : PluginUpdateStatus()

    class Update(val pluginDescriptor: IdeaPluginDescriptor, val hostToInstallFrom: String?) : PluginUpdateStatus()

    class CheckFailed(val message: String, val detail: String?) : PluginUpdateStatus()

    companion object {

        fun fromException(message: String, e: Exception): PluginUpdateStatus {
            val stringWriter = StringWriter()
            e.printStackTrace(PrintWriter(stringWriter))
            return CheckFailed(message, stringWriter.toString())
        }
    }
}
