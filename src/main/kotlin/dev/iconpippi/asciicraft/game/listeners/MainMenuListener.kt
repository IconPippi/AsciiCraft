package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.AsciiCraft
import dev.iconpippi.asciicraft.game.event.Event
import dev.iconpippi.asciicraft.game.event.KeyEvent
import dev.iconpippi.asciicraft.game.gui.LoginScreen
import kotlin.system.exitProcess

/**
 * 25/9/2019
 * Main menu listener, listens for all main menu key events
 *
 * @author IconPippi
 */
object MainMenuListener : IListener {

    override fun handler(e: Event) {
        if (!AsciiCraft.mainMenu) return
        e as KeyEvent

        when (e.keyCode) {
            java.awt.event.KeyEvent.VK_Q -> { //Quit
                exitProcess(0) //quit the game
            }
            java.awt.event.KeyEvent.VK_L -> { //Login
                AsciiCraft.mainMenu = false
                AsciiCraft.loginScreen = true
                Renderer.clearScreen()

                LoginScreen.draw(true)
            }
        }
    }

}