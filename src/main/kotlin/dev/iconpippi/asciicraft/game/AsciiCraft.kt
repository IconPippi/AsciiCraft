package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.DisplayManager
import dev.iconpippi.asciicraft.engine.Renderer
import java.awt.Color

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
        Renderer.drawChar(1, 0, 'Y', Color.GREEN)
        Renderer.drawChar(2, 0, 'Y', Color.GREEN)
        Renderer.drawPixel(50, 25, Color.GREEN)
        Renderer.renderScreen()
    }

}