package dev.iconpippi.asciicraft.engine.control

/**
 * 25/9/2019
 * Provides key-related functions
 *
 * @author IconPippo
 */
object Keyboard {

    /** Pressed keys */
    val pressedKeys: ArrayList<Int> = ArrayList()

    /**
     * Checks if a key is pressed
     *
     * @param keyCode Code of the key
     * @return True if key is pressed
     */
    fun checkKey(keyCode: Int): Boolean {
        return pressedKeys.contains(keyCode)
    }

}