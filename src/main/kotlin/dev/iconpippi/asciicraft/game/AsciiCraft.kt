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

    /** Main manu state */
    var mainMenu: Boolean = false
    /** Login screen state */
    var loginScreen: Boolean = false

    /**
     * Start the game
     */
    fun start() {
        DisplayManager.setupConsole()

        mainMenu = true
        MainMenu.draw(true)
    }

}