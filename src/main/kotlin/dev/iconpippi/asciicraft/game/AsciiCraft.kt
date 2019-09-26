package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.DisplayManager
import dev.iconpippi.asciicraft.game.art.ArtManager
import dev.iconpippi.asciicraft.game.event.EventsManager
import dev.iconpippi.asciicraft.game.event.KeyEvent
import dev.iconpippi.asciicraft.game.listeners.MainMenuListener

/**
 * 19/9/2019
 * Main class for AsciiCraft game
 *
 * @author IconPippi
 */
object AsciiCraft {

    var mainMenu: Boolean = false
    var loginScreen: Boolean = false

    init {
        //Register all needed key events
        EventsManager.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_Q, MainMenuListener)) //Login
        EventsManager.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_L, MainMenuListener)) //Quit
    }

    /**
     * Start the game
     */
    fun start() {
        DisplayManager.setupConsole()

        mainMenu = true
        ArtManager.drawMainMenu(true)
    }

}