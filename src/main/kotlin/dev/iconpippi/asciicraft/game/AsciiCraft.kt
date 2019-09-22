package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.DisplayManager
import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.AsciiCraftLogo
import java.awt.Color

/**
 * 19/9/2019
 * This class is only being used for engine testing at the moment
 *
 * @author IconPippi
 */
class AsciiCraft : Thread() {

    /**
     * Start the game
     */
    override fun start() {
        DisplayManager.setupConsole()

        AsciiCraftLogo.xPos = 16
        AsciiCraftLogo.draw(false)

        Renderer.renderScreen()
    }

}