package dev.iconpippi.asciicraft.game.gui

import dev.iconpippi.asciicraft.game.art.ASCIIArt
import dev.iconpippi.asciicraft.game.art.other.ASCIICraftTitle
import dev.iconpippi.asciicraft.game.art.other.Pointer
import dev.iconpippi.asciicraft.game.art.text.BackText
import dev.iconpippi.asciicraft.game.event.EventRegisterer
import dev.iconpippi.asciicraft.game.listeners.LoginScreenListener
import dev.iconpippi.asciicraft.game.event.KeyEvent

/**
 * 27/8/2019
 * Login screen gui
 *
 * @author IconPippi
 */
object LoginScreen : Gui() {

    override val components: List<ASCIIArt> = ArrayList()

    init {
        //Add all components
        components as ArrayList

        components.add(ASCIICraftTitle(31, 5))
        components.add(BackText(91, 50))
        components.add(Pointer(86, 50))

        //Register key events
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_UP), LoginScreenListener) //Move pointer up
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_DOWN), LoginScreenListener) //Move pointer down
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_ENTER), LoginScreenListener) //Enter
    }

}