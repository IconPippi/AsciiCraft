package dev.iconpippi.asciicraft.engine.display

import dev.iconpippi.asciicraft.engine.control.Keyboard
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

/**
 * 9/24/2019
 * Java swing key listener
 *
 * @author IconPippi
 */
object KeyListener : KeyListener {

    override fun keyReleased(e: KeyEvent?) {
        Keyboard.pressedKeys.remove(e!!.keyCode)
    }

    override fun keyPressed(e: KeyEvent?) {
        Keyboard.pressedKeys.add(e!!.keyCode)
    }

    override fun keyTyped(e: KeyEvent?) {}

}