package dev.iconpippi.asciicraft.game.art.text

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIIArt
import java.awt.Color

/**
 * 24/9/2019
 * This object represents the "QUIT (Q)" text in the main menu
 *
 * @param xPos Art X pos
 * @param yPos Art Y pos
 *
 * @author IconPippi
 */
class QuitText(override var xPos: Int, override var yPos: Int) : ASCIIArt, Text("QUIT") {

    private val text: ArrayList<String> = generateText() as ArrayList<String>

    override fun draw(render: Boolean) {
        Renderer.drawLines(
            xPos,
            yPos,
            text, Color.BLUE)

        if (render) Renderer.renderScreen()
    }
}