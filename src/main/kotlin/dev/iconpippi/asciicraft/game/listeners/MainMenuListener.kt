package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.AsciiCraft
import dev.iconpippi.asciicraft.game.event.Event
import dev.iconpippi.asciicraft.game.event.KeyEvent
import dev.iconpippi.asciicraft.game.gui.LoginScreen
import dev.iconpippi.asciicraft.game.gui.MainMenu
import kotlin.system.exitProcess

/**
 * 25/9/2019
 * Main menu listener, listens for all main menu key events
 *
 * @author IconPippi
 */
object MainMenuListener : IListener {

    override fun handler(e: Event) {
        if (!AsciiCraft.mainMenu && AsciiCraft.loginScreen) return
        e as KeyEvent

        when (e.keyCode) {
            java.awt.event.KeyEvent.VK_UP -> {
                val pointer = MainMenu.components.component5() //Get pointer object

                if (pointer.yPos != 37) pointer.yPos = 37 //If it isn't already at the top of the choices, move up
                else return

                //Update GUI
                //TODO: Better updating system
                MainMenu.hide()
                MainMenu.draw(true)
            }
            java.awt.event.KeyEvent.VK_DOWN -> {
                val pointer = MainMenu.components.component5()

                if (pointer.yPos != 43) pointer.yPos = 43
                else return

                MainMenu.hide()
                MainMenu.draw(true)
            }
            java.awt.event.KeyEvent.VK_ENTER -> {
                val pointer = MainMenu.components.component5()

                if (pointer.yPos == 37) loginScreen() //If it's pointing to login text -> login screen
                else if (pointer.yPos == 43) exitProcess(0) //If it's pointing to quit text -> quit
            }
        }
    }

    private fun loginScreen() {
        AsciiCraft.mainMenu = false
        AsciiCraft.loginScreen = true
        Renderer.clearScreen()

        LoginScreen.draw(true)
    }

}