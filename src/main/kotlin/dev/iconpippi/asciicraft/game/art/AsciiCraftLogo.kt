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

    override var xPos: Int = 8
    override var yPos: Int = 3

    override fun draw(render: Boolean) {

        drawRow(')', ')', ')', '#', '#', ')',
            '#', ')', ')', ')', ')', ')', ')', ')', '#', ')', color = Color.GREEN, y = yPos)

        drawBlock(xPos, yPos+3, ')', Color.GREEN)
        drawBlock(xPos+4, yPos+3, ')', Color.GREEN)
        drawBlock(xPos+8, yPos+3, ')', Color.GREEN)
        drawBlock(xPos+12, yPos+3, '/', Color.GREEN)
        drawBlock(xPos+16, yPos+3, '/', Color.GREEN)
        drawBlock(xPos+20, yPos+3, '#', Color.DARK_GRAY)
        drawBlock(xPos+24, yPos+3, '#', Color.GREEN)
        drawBlock(xPos+28, yPos+3, '#', Color.GREEN)
        drawBlock(xPos+32, yPos+3, '#', Color.GREEN)
        drawBlock(xPos+36, yPos+3, '/', Color.GREEN)
        drawBlock(xPos+40, yPos+3, '/', Color.GREEN)
        drawBlock(xPos+44, yPos+3, ')', Color.GREEN)
        drawBlock(xPos+48, yPos+3, '#', Color.GREEN)
        drawBlock(xPos+52, yPos+3, ')', Color.GREEN)
        drawBlock(xPos+56, yPos+3, ')', Color.GREEN)
        drawBlock(xPos+60, yPos+3, ')', Color.GREEN)

        drawBlock(xPos, yPos+6, ')', Color.GREEN)
        drawBlock(xPos+4, yPos+6, '#', Color.DARK_GRAY)
        drawBlock(xPos+8, yPos+6, '/', Color.GREEN)
        drawBlock(xPos+12, yPos+6, '#', Color.GREEN)
        drawBlock(xPos+16, yPos+6, '#', Color.GREEN)
        drawBlock(xPos+20, yPos+6, '#', Color.DARK_GRAY)
        drawBlock(xPos+24, yPos+6, '#', Color.GREEN)
        drawBlock(xPos+28, yPos+6, '#', Color.DARK_GRAY)
        drawBlock(xPos+32, yPos+6, ')', Color.GREEN)
        drawBlock(xPos+36, yPos+6, ')', Color.GREEN)
        drawBlock(xPos+40, yPos+6, '/', Color.GREEN)
        drawBlock(xPos+44, yPos+6, '/', Color.GREEN)
        drawBlock(xPos+48, yPos+6, '#', Color.DARK_GRAY)
        drawBlock(xPos+52, yPos+6, '#', Color.GREEN)
        drawBlock(xPos+56, yPos+6, '#', Color.GREEN)
        drawBlock(xPos+60, yPos+6, '#', Color.DARK_GRAY)

        drawBlock(xPos, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+4, yPos+9, ',', Color.DARK_GRAY)
        drawBlock(xPos+8, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+12, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+16, yPos+9, '#', Color.GREEN)
        drawBlock(xPos+20, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+24, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+28, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+32, yPos+9, '#', Color.GREEN)
        drawBlock(xPos+36, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+40, yPos+9, '#', Color.GREEN)
        drawBlock(xPos+44, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+48, yPos+9, '$', Color.DARK_GRAY)
        drawBlock(xPos+52, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+56, yPos+9, '#', Color.DARK_GRAY)
        drawBlock(xPos+60, yPos+9, '$', Color.DARK_GRAY)

        drawRow('/', '$', '/', ')', '#', '/',
            '/', '/', '#', '#', '#', ',', '$', '/', '#', '$', color = Color.DARK_GRAY, y = yPos+12)

        drawRow('$', '#', '/', '/', '$', '/',
            '#', '#', '#', '$', '$', '#', '$', '$', '$', ')', color = Color.DARK_GRAY, y = yPos+15)

        drawRow(')', '#', '$', '$', '"', '$',
            '$', ')', ')', '$', ')', ')', '$', '/', '$', '/', color = Color.DARK_GRAY, y = yPos+18)

        drawRow(')', '$', ')', ')', '/', '/',
            '$', '$', '/', '/', '/', '/', '$', '$', '/', '/', color = Color.DARK_GRAY, y = yPos+21)

        drawRow('/', '$', '$', '/', '$', '/',
            '$', '/', '$', '/', '/', '$', '$', '$', '#', '$', color = Color.DARK_GRAY, y = yPos+24)

        drawRow('/', '/', '#', '$', '$', '#',
            '#', '$', '$', '$', '$', '$', ')', ')', '$', '/', color = Color.DARK_GRAY, y = yPos+27)

        drawRow('/', '/', '$', ')', ')', '$',
            ')', '/', '/', ')', ')', '$', '/', '/', '"', '$', color = Color.DARK_GRAY, y = yPos+30)

        if (render) Renderer.renderScreen()
    }

    //Draw a row of blocks
    private fun drawRow(vararg chars: Char, color: Color, y: Int) {
            var pos: Int = xPos-4
            for (c in chars) {
                pos += 4
                drawBlock(pos, y, c, color)
            }
    }

    //Helper method to make 4x3 ascii blocks, i.e.
    //   ####
    //   ####
    //   ####
    private fun drawBlock(x: Int, y: Int, char: Char, color: Color) {
        Renderer.drawCharRectangle(x, y, x+4, y+3, char, color)
    }

}