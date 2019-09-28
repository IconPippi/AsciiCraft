package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.game.event.Event

/**
 * 25/9/2019
 * Event listener interface
 *
 * @author IconPippi
 */
interface IListener {

    /**
     * This function gets called once a key event is received
     *
     * @param e Key event
     */
    fun handler(e: Event)

}