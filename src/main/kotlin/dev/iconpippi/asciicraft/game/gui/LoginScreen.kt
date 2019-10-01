package dev.iconpippi.asciicraft.game.gui

import dev.iconpippi.asciicraft.game.art.ASCIIArt
import dev.iconpippi.asciicraft.game.art.other.ASCIICraftTitle
import dev.iconpippi.asciicraft.game.art.other.Pointer
import dev.iconpippi.asciicraft.game.art.text.Text
import dev.iconpippi.asciicraft.game.event.EventRegisterer
import dev.iconpippi.asciicraft.game.listeners.LoginScreenListener
import dev.iconpippi.asciicraft.game.event.KeyEvent
import java.awt.Color

/**
 * 27/8/2019
 * Login screen gui
 *
 * @author IconPippi
 */
object LoginScreen : Gui() {

    override var drawn: Boolean = false
    override val components: ArrayList<ASCIIArt> = ArrayList()

    override fun init(): Gui {
        //Add all components
        components

        components.add(ASCIICraftTitle(31, 5))
        components.add(Text(91, 50, "BACK", Color.BLUE))
        components.add(Text(34, 10, "USERNAME", Color.BLUE))
        components.add(Text(34, 40, "PASSWORD", Color.BLUE))
        components.add(Pointer(29, 10))

        val ptr = components[4] as Pointer
        ptr.addTarget(components[1])
        ptr.addTarget(components[2])
        ptr.addTarget(components[3])

        //Register key events
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_UP), LoginScreenListener) //Move pointer up
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_DOWN), LoginScreenListener) //Move pointer down
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_ENTER), LoginScreenListener) //Enter

        return this
    }

}