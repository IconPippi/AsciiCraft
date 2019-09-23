package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.DisplayManager
import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIICraftLogo
import dev.iconpippi.asciicraft.game.art.ASCIICraftTitle

/**
 * 19/9/2019
 * Main class for AsciiCraft game
 *
 * @author IconPippi
 */
class AsciiCraft {

    /**
     * Start the game
     */
    fun start() {
        DisplayManager.setupConsole()

        drawMainMenu()

        Renderer.renderScreen()
    }

    private fun drawMainMenu() {
        ASCIICraftLogo.xPos = 21
        ASCIICraftLogo.draw(false)
        ASCIICraftTitle.draw(false)
    }

}