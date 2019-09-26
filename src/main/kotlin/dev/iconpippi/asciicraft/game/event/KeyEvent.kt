package dev.iconpippi.asciicraft.game.event

import dev.iconpippi.asciicraft.engine.control.Keyboard
import dev.iconpippi.asciicraft.game.listeners.IListener

/**
 * 25/9/2019
 * Key event
 *
 * @param keyCode Code of the target key
 * @param listener Listener for this event
 *
 * @author IconPippi
 */
class KeyEvent(val keyCode: Int, listener: IListener) : Event(listener) {

    init {
        Thread { //Do not interrupt the main thread!
            while (!Thread.currentThread().isInterrupted) {
                if (Keyboard.checkKey(keyCode))
                    listener.handler(this)
            }
        }.start()
    }

}