package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.DisplayManager
import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.engine.util.HtmlColor

/**
 * 19/9/2019
 * This class is only being used for engine testing at the moment
 *
 * @author IconPippi
 */
class AsciiCraft {

    /**
     * Start the game
     */
    fun start() {
        DisplayManager.setupConsole()
        Renderer.drawPixel(0, 0, HtmlColor.BLUE)
        Renderer.renderScreen()
    }

}