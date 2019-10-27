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

        components.add(ASCIICraftTitle(31, 5)) //0
        components.add(Text(91, 50, "BACK", Color.BLUE)) //1
        components.add(Text(5, 20, "USERNAME:", Color.BLUE)) //2
        components.add(Text(5, 30, "PASSWORD:", Color.BLUE)) //3
        components.add(Text(5, 50, "LOGIN", Color.BLUE)) //4
        components.add(Pointer(components[2].xPos -5, components[2].yPos)) //5
        components.add(Text(50, 20, "___________", Color.GREEN)) //6
        components.add(Text(50, 30, "___________", Color.GREEN)) //7

        val ptr = components[5] as Pointer
        ptr.addTarget(components[1])
        ptr.addTarget(components[2])
        ptr.addTarget(components[3])
        ptr.addTarget(components[4])

        //Register key events
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_UP), LoginScreenListener) //Move pointer up
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_DOWN), LoginScreenListener) //Move pointer down
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_LEFT), LoginScreenListener) //Move pointer left
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_RIGHT), LoginScreenListener) //Move pointer right
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_ENTER), LoginScreenListener) //Enter

        return this
    }

}