package dev.iconpippi.asciicraft.engine

import dev.iconpippi.asciicraft.engine.console.ASCIIDisplay

/**
 * 19/9/2019
 * Manages ASCII displays
 *
 * @author IconPippi
 */
object DisplayManager {

    //Display sizes
    private const val width: Int = 800
    private const val height: Int = 800

    //Display name
    private const val name: String = "AsciiCraft v0.1"

    /** ASCII Display instance */
    val asciiDisplay: ASCIIDisplay =
        ASCIIDisplay(width, height, name)

    /**
     * Set up the display
     */
    fun setupConsole() {
        asciiDisplay.setUp()
        asciiDisplay.show()
    }

}