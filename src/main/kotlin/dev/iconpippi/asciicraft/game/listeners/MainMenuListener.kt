package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.game.art.other.Pointer
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
        if (!MainMenu.drawn) return
        e as KeyEvent

        when (e.keyCode) {
            java.awt.event.KeyEvent.VK_UP -> {
                val pointer = MainMenu.components.component5() as Pointer//Get pointer object

                if (pointer.yPos != 37) pointer.yPos = 37 //If it isn't already at the top of the choices, move up
                else return

                //Update GUI
                MainMenu.hide()
                MainMenu.draw(true)
            }
            java.awt.event.KeyEvent.VK_DOWN -> {
                val pointer = MainMenu.components.component5() as Pointer

                if (pointer.yPos != 43) pointer.yPos = 43
                else return

                MainMenu.hide()
                MainMenu.draw(true)
            }
            java.awt.event.KeyEvent.VK_ENTER -> {
                Thread.sleep(200)
                val pointer = MainMenu.components.component5()

                if (pointer.yPos == 37) { //If it's pointing to login text -> login screen
                    MainMenu.hide()
                    LoginScreen.draw(true)
                }
                else if (pointer.yPos == 43) exitProcess(0) //If it's pointing to quit text -> quit
            }
        }
    }

}