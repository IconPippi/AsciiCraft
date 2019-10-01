package dev.iconpippi.asciicraft.game.gui

import dev.iconpippi.asciicraft.game.art.ASCIIArt
import dev.iconpippi.asciicraft.game.art.other.ASCIICraftLogo
import dev.iconpippi.asciicraft.game.art.other.ASCIICraftTitle
import dev.iconpippi.asciicraft.game.art.other.Pointer
import dev.iconpippi.asciicraft.game.art.text.Text
import dev.iconpippi.asciicraft.game.event.EventRegisterer
import dev.iconpippi.asciicraft.game.listeners.MainMenuListener
import dev.iconpippi.asciicraft.game.event.KeyEvent
import java.awt.Color

/**
 * 28/9/2019
 * Main menu GUI
 *
 * @author IconPippi
 */
object MainMenu : Gui() {

    override var drawn: Boolean = false
    override val components: ArrayList<ASCIIArt> = ArrayList()

    override fun init(): Gui {
        //Add all components
        components

        components.add(ASCIICraftLogo(23, 3))
        components.add(ASCIICraftTitle(31, 25))
        components.add(Text(37, 37, "LOGIN", Color.BLUE))
        components.add(Text(37, 43, "QUIT", Color.BLUE))
        components.add(Pointer(32, 37))

        val ptr = components[4] as Pointer
        ptr.addTarget(components[2])
        ptr.addTarget(components[3])

        //Register key events
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_UP), MainMenuListener) //Move pointer up
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_DOWN), MainMenuListener) //Move pointer down
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_ENTER), MainMenuListener) //Select option

        return this
    }

}