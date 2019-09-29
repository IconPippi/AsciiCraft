package dev.iconpippi.asciicraft.game.listeners

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
        if (!LoginScreen.drawn) return
        e as KeyEvent

        when (e.keyCode) {
            java.awt.event.KeyEvent.VK_ENTER -> {
                Thread.sleep(200)

                LoginScreen.hide()
                MainMenu.draw(true)
            }
        }
    }

}