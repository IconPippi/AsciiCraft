package dev.iconpippi.asciicraft.game.gui

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIIArt

/**
 * 27/9/2019
 * Defines a graphic user interface
 *
 * @author IconPippi
 */
abstract class Gui {

    /** Drawn */
    abstract var drawn: Boolean

    /** ASCIIArt compoents for this interface */
    abstract val components: ArrayList<ASCIIArt>

    /**
     * Draw the GUI
     *
     * @param render True if you want to render the gui after finished drawing
     */
    fun draw(render: Boolean) {
        drawn = true

        components.forEach {
            it.draw(false)
        }

        if (render) Renderer.renderScreen()
    }

    /**
     * Erase the gui
     */
    fun erase() {
        drawn = false

        components.clear()
        Renderer.clearScreen()
    }

    /**
     * Hide the GUI
     */
    fun hide() {
        drawn = false
        Renderer.clearScreen()
    }

    /**
     * Refresh the GUI
     */
    fun refresh() {
        hide()
        draw(true)
    }

    /**
     * Init your gui components
     */
    abstract fun init(): Gui

}