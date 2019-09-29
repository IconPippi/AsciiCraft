package dev.iconpippi.asciicraft.game.art.text

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIIArt
import java.awt.Color

/**
 * 28/9/2019
 * "Back (B)" text ascii art
 *
 * @param xPos Art X pos
 * @param yPos Art Y pos
 *
 * @author IconPippi
 */
class BackText(override var xPos: Int, override var yPos: Int) : ASCIIArt, Text("BACK") {

    private val text: ArrayList<String> = generateText() as ArrayList<String>

    override fun draw(render: Boolean) {
        Renderer.drawLines(
            xPos,
            yPos,
            text, Color.BLUE)

        if (render) Renderer.renderScreen()
    }

}