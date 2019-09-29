package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.DisplayManager
import dev.iconpippi.asciicraft.game.gui.MainMenu

/**
 * 19/9/2019
 * Main class for AsciiCraft game
 *
 * @author IconPippi
 */
object AsciiCraft {

    /**
     * Start the game
     */
    fun start() {
        DisplayManager.setupConsole()

        MainMenu.draw(true)
    }

}