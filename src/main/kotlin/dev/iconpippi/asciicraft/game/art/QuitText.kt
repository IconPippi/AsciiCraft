package dev.iconpippi.asciicraft.game.art

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.IASCIIArt
import java.awt.Color

/**
 * 24/9/2019
 * This object represents the "QUIT (Q)" text in the main menu
 *
 * @author IconPippi
 */
object QuitText : IASCIIArt {

    override var xPos: Int = 37
    override var yPos: Int = 43

    private val text: ArrayList<String> = ArrayList()

    init {
        text.add(" __         ___      __")
        text.add("|  | |  | |  |    / |  | \\")
        text.add("|  | |  | |  |   |  |  |  |")
        text.add("|__\\ |__| |  |    \\ |__\\ /")
    }

    override fun draw(render: Boolean) {
        Renderer.drawLines(xPos, yPos, text, Color.BLUE)

        if (render) Renderer.renderScreen()
    }
}