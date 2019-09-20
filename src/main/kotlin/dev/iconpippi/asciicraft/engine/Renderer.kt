package dev.iconpippi.asciicraft.engine

import dev.iconpippi.asciicraft.engine.console.ASCIIDisplay
import dev.iconpippi.asciicraft.engine.console.Pixel

//TODO: Color rendering
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
        asciiDisplay.lines.forEach {
            //asciiDisplay.addLine("<html>${it.eval()}</html>\r\n")
            asciiDisplay.addLine("${it.eval()}\r\n")
        }
    }

    /**
     * Draw a pixel
     *
     * @param x X position (max 113)
     * @param y Y position (max 54)
     * @param ansiColor Ansi color code TODO: todo
     */
    fun drawPixel(x: Int, y: Int, ansiColor: String) {
        asciiDisplay.lines[y].addPixel(x, Pixel(ansiColor))
    }

    /**
     * Draw a character
     *
     * @param x X position (max 113)
     * @param y Y position (max 54)
     * //TODO: colors
     */
    fun drawChar(x: Int, y: Int, char: Char) {
        asciiDisplay.lines[y].addChar(x, char)
    }

}