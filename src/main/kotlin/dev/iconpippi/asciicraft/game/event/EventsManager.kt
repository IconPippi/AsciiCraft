package dev.iconpippi.asciicraft.game.event

/**
 * 25/9/2019
 * Register new events
 *
 * @author IconPippi
 */
object EventsManager {

    //Events list
    private val events = mutableListOf<Event>()

    /**
     * Register a new event
     *
     * @param e Event
     */
    fun registerEvent(e: Event) {
        events.add(e)
    }

}