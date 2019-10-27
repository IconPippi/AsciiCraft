package dev.iconpippi.asciicraft.engine

import dev.iconpippi.asciicraft.engine.display.DisplayWindow
import dev.iconpippi.asciicraft.engine.input.InputWindow

/**
 * 19/9/2019
 * Manages ASCII displays
 *
 * @author IconPippi
 */
object WindowManager {

    //Display sizes
    private const val width: Int = 800
    private const val height: Int = 800

    //Display name
    private const val name: String = "AsciiCraft v0.1"

    /**
     * Create the main display
     */
    fun createDisplay(show: Boolean): DisplayWindow {
        val display = DisplayWindow(width, height, name)
        display.setUp()

        if (show) display.show()

        Renderer.DISPLAY_WINDOW = display
        return display
    }

    /**
     * Create a new input window
     */
    fun createInputWindow(title: String, inputListener: (String) -> Unit): InputWindow {
        return InputWindow(title, inputListener)
    }

}