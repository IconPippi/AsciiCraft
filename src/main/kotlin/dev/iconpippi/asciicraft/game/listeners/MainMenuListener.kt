package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.game.art.other.Pointer
import dev.iconpippi.asciicraft.game.art.text.Text
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

        Thread.sleep(200)
        when (e.keyCode) {
            java.awt.event.KeyEvent.VK_UP -> {
                val pointer = MainMenu.components.component5() as Pointer //Get pointer object

                try {
                    pointer.switch("up")
                    MainMenu.refresh()
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_DOWN -> {
                val pointer = MainMenu.components.component5() as Pointer

                try {
                    pointer.switch("down")
                    MainMenu.refresh()
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_ENTER -> {
                Thread.sleep(200)
                val pointer = MainMenu.components.component5() as Pointer

                if ((pointer.getBindedArt() as Text).text.contains("LOGIN")) { //If it's pointing to login text -> login screen
                    MainMenu.erase()
                    LoginScreen.init().draw(true)
                } else { //If it's pointing to quit text -> quit
                    exitProcess(0)
                }
            }
        }
    }

}