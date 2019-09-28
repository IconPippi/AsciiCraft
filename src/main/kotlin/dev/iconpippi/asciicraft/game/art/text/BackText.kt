package dev.iconpippi.asciicraft.game.art.text

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIIArt
import java.awt.Color

/**
 * 28/9/2019
 * "Back" text ascii art
 *
 * @author IconPippi
 */
object BackText : ASCIIArt() {

    override val xPos: Int = 84
    override val yPos: Int = 50

    private val text: ArrayList<String> = ArrayList()

    init {
        text.add(" __   __   __         __")
        text.add("|__/ |__| |   | /  / |__/ \\")
        text.add("|  \\ |  | |   |\\  |  |  \\  |")
        text.add("|__/ |  | |__ | \\  \\ |__/ /")
    }

    override fun draw(render: Boolean) {
        Renderer.drawLines(
            xPos,
            yPos,
            text, Color.BLUE)

        if (render) Renderer.renderScreen()
    }

}