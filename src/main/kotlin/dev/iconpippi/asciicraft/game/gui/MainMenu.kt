package dev.iconpippi.asciicraft.game.gui

import dev.iconpippi.asciicraft.game.art.ASCIIArt
import dev.iconpippi.asciicraft.game.art.other.ASCIICraftLogo
import dev.iconpippi.asciicraft.game.art.other.ASCIICraftTitle
import dev.iconpippi.asciicraft.game.art.text.LoginText
import dev.iconpippi.asciicraft.game.art.text.QuitText
import dev.iconpippi.asciicraft.game.event.EventRegisterer
import dev.iconpippi.asciicraft.game.listeners.MainMenuListener
import dev.iconpippi.asciicraft.game.event.KeyEvent

/**
 * 28/9/2019
 * Main menu GUI
 *
 * @author IconPippi
 */
object MainMenu : Gui() {

    override val components: List<ASCIIArt> = ArrayList()

    init {
        //Add all components
        components as ArrayList

        components.add(ASCIICraftLogo(23, 3))
        components.add(ASCIICraftTitle(31, 25))
        components.add(LoginText)
        components.add(QuitText)

        //Register key events
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_Q), MainMenuListener) //Login
        EventRegisterer.registerEvent(KeyEvent(java.awt.event.KeyEvent.VK_L), MainMenuListener) //Quit
    }

}