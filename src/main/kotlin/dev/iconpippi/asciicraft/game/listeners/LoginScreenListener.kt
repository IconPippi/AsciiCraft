package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.game.AsciiCraft
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
        if (!AsciiCraft.loginScreen && AsciiCraft.mainMenu) return
        e as KeyEvent

        when (e.keyCode) {
            //TODO: Pointer controller
            java.awt.event.KeyEvent.VK_ENTER -> {
                AsciiCraft.loginScreen = false
                AsciiCraft.mainMenu = true

                LoginScreen.hide()
                MainMenu.draw(true)
            }
        }
    }

}