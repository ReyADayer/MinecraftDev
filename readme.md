<a href="https://minecraftdev.org/"><img src="https://minecraftdev.org/assets/icon.svg" height="27" width="27"></img></a>Minecraft Development for IntelliJ [![forthebadge](http://forthebadge.com/images/badges/made-with-crayons.svg)](http://forthebadge.com)
==========================================================================================================================================
[![GitHub Stars](https://img.shields.io/github/stars/minecraft-dev/MinecraftDev.svg?style=flat-square)](https://github.com/minecraft-dev/MinecraftDev/stargazers) [![GitHub Issues](https://img.shields.io/github/issues/minecraft-dev/MinecraftDev.svg?style=flat-square)](https://github.com/minecraft-dev/MinecraftDev/issues) [![TeamCity Build Status](https://img.shields.io/teamcity/http/ci.demonwav.com/s/MinecraftDev_Build.svg?style=flat-square)](https://ci.demonwav.com/viewType.html?buildTypeId=MinecraftDev_Build) [![Current Release](https://img.shields.io/badge/release-2016.3--0.4.5-orange.svg?style=flat-square)](https://plugins.jetbrains.com/plugin/8327)

Info and Documentation
----------------------

Visit [https://minecraftdev.org](https://minecraftdev.org) for information about the project, change logs, features, FAQs, and chat.

Installation
------------

This plugin is available on the [Jetbrains IntelliJ plugin repository](https://plugins.jetbrains.com/plugin/8327).

Because of this, you can install the plugin through IntelliJ's internal plugin browser. Navigate to
`File -> Settings -> Plugins` and click the `Browser Repositories...` button at the bottom of the window. In the search
box, simply search for `Minecraft` and this plugin will be the only result it shows. You can install it from there and
restart IntelliJ to activate the plugin.

Building
--------

Make sure you have Java 8 installed.

Build the plugin with:

`./gradlew build`

The output .zip file for the plugin will be in `build/distributions`.

Test the plugin in IntelliJ with:

`./gradlew runIdea`

The [Gradle IntelliJ Plugin](https://github.com/JetBrains/gradle-intellij-plugin)
will handle downloading the IntelliJ dependencies and packaging the
plugin.

Style Guide
-----------

This project will follow DemonWav's Java style guidelines (lol, Google's
style slightly modified). Link [here](http://www.demonwav.com/style).

Developers
----------

[**@DemonWav** - Kyle Wood](https://github.com/DemonWav)

#### **Contributors**

- [**@gabizou** - Gabriel Harris-Rouquette](https://github.com/gabizou)
- [**@kashike**](https://github.com/kashike)
- [**@jamierocks** - Jamie Mansfield](https://github.com/jamierocks)
- [**@Minecrell**](https://github.com/Minecrell)

Issues
------

We have a few ambiguous labels on the issues page, so here are their definitions:
 * `platform: all` - An issue which applies to all supported platforms (`Bukkit`, `Sponge`, `BungeeCord`, `Forge`, `LiteLoader`, and `Canary`)
 * `platform: main` - Multiple platforms, containing at least `Bukkit`, `Sponge`, and `Forge`. It can contain either of the other two as
   well, as long as it doesn't contain all of them. In that case, `platform: all` would be more appropriate, of course.
 * `platform: multi` - Any issue with more than two platforms which doesn't fall under the first two categories.

License
-------

This project is licensed under [MIT](license.txt).

Supported Platforms
-------------------

- [![Bukkit Icon](src/main/resources/assets/icons/platform/Bukkit.png?raw=true) **Bukkit**](https://hub.spigotmc.org/stash/projects/SPIGOT/repos/bukkit/browse) ([![Spigot Icon](src/main/resources/assets/icons/platform/Spigot.png?raw=true) Spigot](https://spigotmc.org/) and [![Paper Icon](src/main/resources/assets/icons/platform/Paper.png?raw=true) Paper](https://paper.emc.gs))
- [![Sponge Icon](src/main/resources/assets/icons/platform/Sponge_dark.png?raw=true) **Sponge**](https://www.spongepowered.org/)
- [![Forge Icon](src/main/resources/assets/icons/platform/Forge.png?raw=true) **Minecraft Forge**](http://minecraftforge.net/forum)
- [![LiteLoader Icon](src/main/resources/assets/icons/platform/LiteLoader.png?raw=true) **LiteLoader**](http://www.liteloader.com/)
- [![MCP Icon](src/main/resources/assets/icons/platform/MCP.png?raw=true) **MCP**](http://www.modcoderpack.com/)
- [![Mixins Icon](src/main/resources/assets/icons/platform/Mixins_dark.png?raw=true) **Mixins**](https://github.com/SpongePowered/Mixin)
- [![BungeeCord Icon](src/main/resources/assets/icons/platform/BungeeCord.png?raw=true) **BungeeCord**](https://www.spigotmc.org/wiki/bungeecord/)
- [![Canary Icon](src/main/resources/assets/icons/platform/Canary.png?raw=true) **Canary**](https://canarymod.net/) ([![Neptune Icon](src/main/resources/assets/icons/platform/Neptune.png?raw=true) **Neptune**](https://www.neptunepowered.org/))
