package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.game.art.other.Pointer
import dev.iconpippi.asciicraft.game.art.text.Text
import dev.iconpippi.asciicraft.game.event.Event
import dev.iconpippi.asciicraft.game.event.KeyEvent
import dev.iconpippi.asciicraft.game.gui.LoginScreen
import dev.iconpippi.asciicraft.game.gui.MainMenu

/**
 * 27/9/2019
 * Login screen key listener
 *
 * @author IconPippi
 */
object LoginScreenListener : IListener {

    override fun handler(e: Event) {
        if (!LoginScreen.drawn && MainMenu.drawn) return
        e as KeyEvent

        when (e.keyCode) {
            java.awt.event.KeyEvent.VK_UP -> {
                val pointer = LoginScreen.components.component5() as Pointer

                try {
                    pointer.switch("up")
                    LoginScreen.hide()
                    LoginScreen.draw(true)
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_DOWN -> {
                val pointer = LoginScreen.components.component5() as Pointer

                try {
                    pointer.switch("down")
                    LoginScreen.hide()
                    LoginScreen.draw(true)
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_ENTER -> {
                Thread.sleep(200)
                val pointer = LoginScreen.components.component5() as Pointer

                if ((pointer.getBindedArt()!! as Text).text.contains("BACK")) {
                    LoginScreen.erase()
                    MainMenu.init().draw(true)
                }
            }
        }
    }

}