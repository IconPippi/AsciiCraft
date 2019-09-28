package dev.iconpippi.asciicraft.game.event.internal

import dev.iconpippi.asciicraft.engine.control.Keyboard
import dev.iconpippi.asciicraft.game.event.EventRegisterer
import dev.iconpippi.asciicraft.game.event.KeyEvent

/**
 * 28/9/2019
 * Internal keys listener
 *
 * @author IconPippi
 */
object KeysListener {

    init {
        Thread { //Do not interrupt the main thread!
            while (!Thread.currentThread().isInterrupted) {

                for (i in 0 until EventRegisterer.events.size) { //Loop into registered events arraylist
                    val event = EventRegisterer.events[i] as KeyEvent //Define the key event object
                    if (Keyboard.checkKey(event.keyCode)) { //Check if the event's key is pressed
                        EventRegisterer.listeners[i].handler(event) //Send the event to his listener
                    }
                }

            }
        }.start()
    }

}