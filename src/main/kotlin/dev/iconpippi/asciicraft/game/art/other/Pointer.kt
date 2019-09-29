package dev.iconpippi.asciicraft.game.art.other

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIIArt
import java.awt.Color

/**
 * 29/9/2019
 * Pointer ASCII art
 *
 * @author IconPippi
 */
class Pointer(override var xPos: Int, override var yPos: Int) : ASCIIArt {

    private val pointer: ArrayList<String> = ArrayList()

    init {
        pointer.add("\\\\  ")
        pointer.add(" \\\\ ")
        pointer.add(" // ")
        pointer.add("// ")
    }

    override fun draw(render: Boolean) {
        Renderer.drawLines(xPos, yPos, pointer, Color.YELLOW)

        if (render) Renderer.renderScreen()
    }

     fun erase(render: Boolean) {
        pointer.clear()
        pointer.add("")
        pointer.add("")
        pointer.add("")
        pointer.add("")

        Renderer.drawLines(xPos, yPos, pointer, Color.BLACK)

        if (render) Renderer.renderScreen()
    }

}