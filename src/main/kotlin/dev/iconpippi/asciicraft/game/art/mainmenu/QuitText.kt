package dev.iconpippi.asciicraft.game.art.mainmenu

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.IASCIIArt
import java.awt.Color

/**
 * 24/9/2019
 * This object represents the "QUIT (Q)" text in the main menu
 *
 * @author IconPippi
 */
object QuitText : IASCIIArt {

    override val xPos: Int = 37
    override val yPos: Int = 43

    private val text: ArrayList<String> = ArrayList()

    init {
        text.add(" __         ___      __")
        text.add("|  | |  | |  |    / |  | \\")
        text.add("|  | |  | |  |   |  |  |  |")
        text.add("|__\\ |__| |  |    \\ |__\\ /")
    }

    override fun draw(render: Boolean) {
        Renderer.drawLines(37, 43, text, Color.BLUE)

        if (render) Renderer.renderScreen()
    }
}