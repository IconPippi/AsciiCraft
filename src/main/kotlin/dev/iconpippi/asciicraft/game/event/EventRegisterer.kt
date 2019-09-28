package dev.iconpippi.asciicraft.game.event

import com.sun.javafx.iio.common.ImageLoaderImpl
import dev.iconpippi.asciicraft.game.event.internal.KeysListener
import dev.iconpippi.asciicraft.game.listeners.IListener

/**
 * 25/9/2019
 * Register new events
 *
 * @author IconPippi
 */
object EventRegisterer {

    init {
        KeysListener
    }

    /** Registered events */
    val events: ArrayList<Event> = ArrayList()
    /** Linked listeners */
    val listeners: ArrayList<IListener> = ArrayList()

    /**
     * Register a new event
     *
     * @param e Event
     * @param listener Event listener
     */
    fun registerEvent(e: Event, listener: IListener) {
        events.add(e)
        listeners.add(listener)
    }

}