package dev.iconpippi.asciicraft.engine

import dev.iconpippi.asciicraft.engine.display.ASCIIDisplay
import dev.iconpippi.asciicraft.engine.display.components.ASCIIChar
import dev.iconpippi.asciicraft.engine.display.components.Pixel
import java.awt.Color

/**
 * 19/9/2019
 * Manages all display rendering aspects
 *
 * @author IconPippi
 */
object Renderer {

    private val asciiDisplay: ASCIIDisplay = DisplayManager.asciiDisplay

    /**
     * Render the screen
     */
    fun renderScreen() {
        for (i in asciiDisplay.lines.indices) {
            asciiDisplay.lines[i].line(i)
            asciiDisplay.lines[i].render()
        }
    }

    /**
     * Draw a pixel
     *
     * @param x X position (max 113)
     * @param y Y position (max 54)
     * @param color Color
     */
    fun drawPixel(x: Int, y: Int, color: Color) {
        asciiDisplay.lines[y].addPixel(x, Pixel(color))
    }

    /**
     * Draw a character
     *
     * @param x X position (max 113)
     * @param y Y position (max 54)
     * @param char Character
     * @param color Color
     */
    fun drawChar(x: Int, y: Int, char: Char, color: Color) {
        asciiDisplay.lines[y].addChar(x, ASCIIChar(char, color))
    }

}