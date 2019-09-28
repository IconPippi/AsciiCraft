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

    /** ASCIIArt compoents for this interface */
    abstract val components: List<ASCIIArt>

    /**
     * Draw the GUI
     *
     * @param render True if you want to render the gui after finished drawing
     */
    fun draw(render: Boolean) {
        components.forEach {
            it.draw(false)
        }

        if (render) Renderer.renderScreen()
    }

    /**
     * Hide the gui
     */
    fun hide() {
        Renderer.clearScreen()
    }

}