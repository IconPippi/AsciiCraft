package dev.iconpippi.asciicraft.engine.input

import java.awt.event.KeyEvent
import java.awt.event.KeyListener

/**
 * 27/10/2019
 * Input event listener
 *
 * @author IconPippi
 */
class InputListener(private val inputWindow: InputWindow) : KeyListener {

    override fun keyReleased(e: KeyEvent?) {/*Not used*/}

    override fun keyPressed(e: KeyEvent?) {
        if (e!!.keyCode != KeyEvent.VK_ENTER) return

        inputWindow.onInputReceived(inputWindow.pixelArea.text)
        inputWindow.hide()
    }

    override fun keyTyped(e: KeyEvent?) {/*Not used*/}

}