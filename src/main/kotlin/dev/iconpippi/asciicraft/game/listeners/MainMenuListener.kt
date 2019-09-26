package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.game.AsciiCraft
import dev.iconpippi.asciicraft.game.art.ArtManager
import dev.iconpippi.asciicraft.game.event.KeyEvent
import kotlin.system.exitProcess

/**
 * 25/9/2019
 * Main menu listener, listens for all main menu key events
 *
 * @author IconPippi
 */
object MainMenuListener : IListener {

    override fun handler(e: KeyEvent) {
        when (e.keyCode) {

            java.awt.event.KeyEvent.VK_Q -> { //Quit
                if (AsciiCraft.mainMenu) exitProcess(0) //If in the main menu -> quit the game
            }

            java.awt.event.KeyEvent.VK_L -> { //Login
                if (AsciiCraft.mainMenu) {
                    AsciiCraft.mainMenu = false
                    AsciiCraft.loginScreen = true
                    ArtManager.hideMainMenu()
                    //TODO: Login screen
                }
            }

        }
    }

}