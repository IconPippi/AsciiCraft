package dev.iconpippi.asciicraft.game.art

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.ASCIIArt
import java.awt.Color

/**
 * 21/9/2019
 * AsciiCraft logo art
 *
 * @author IconPippi
 */
object AsciiCraftLogo : ASCIIArt {

    override fun draw(render: Boolean) {

        //TODO: Finish ASCII art
        drawBlock(8, 3, '/', Color.GREEN)
        drawBlock(12, 3, '/', Color.GREEN)
        drawBlock(16, 3, '/', Color.GREEN)
        drawBlock(20, 3, '/', Color.GREEN)

        if (render) Renderer.renderScreen()
    }

    private fun drawBlock(x: Int, y: Int, char: Char, color: Color) {
        Renderer.drawCharRectangle(x, y, x+4, y+3, char, color)
    }

}