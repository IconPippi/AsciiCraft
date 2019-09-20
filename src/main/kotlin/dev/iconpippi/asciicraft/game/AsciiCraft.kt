package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.ConsoleManager
import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.engine.util.HtmlColor

class AsciiCraft {

    fun start() {
        ConsoleManager.setupConsole()
        Renderer.drawPixel(0, 0, HtmlColor.BLUE)
        Renderer.renderScreen()
    }

}