package dev.iconpippi.asciicraft.game.art.mainmenu

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.IASCIIArt
import java.awt.Color

/**
 * 24/9/2019
 * This object represents the "LOGIN(L)" text in the main menu
 *
 * @author IconPippi
 */
object LoginText : IASCIIArt {

    override val xPos: Int = 37
    override val yPos: Int = 37

    private val text: ArrayList<String> = ArrayList()

    init {
        text.add("     __   __")
        text.add("|   |  | |    | |\\ |   / |   \\")
        text.add("|   |  | | __ | | \\|  |  |    |")
        text.add("|__ |__| |__| | |  |   \\ |__ /")
    }

    override fun draw(render: Boolean) {
        Renderer.drawLines(
            xPos,
            yPos,
            text, Color.BLUE)

        if (render) Renderer.renderScreen()
    }

}