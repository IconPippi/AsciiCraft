package dev.iconpippi.asciicraft.engine.display.components

import dev.iconpippi.asciicraft.engine.display.DisplayWindow
import java.awt.Color
import javax.swing.text.SimpleAttributeSet
import javax.swing.text.StyleConstants

/**
 * 20/9/2019
 * ASCII display line
 *
 * @param displayWindow ASCII display (where the lines will be rendered)
 *
 * @author IconPippi
 */
class Line(private val displayWindow: DisplayWindow) {

    //Pixels and ASCII chars
    private val pixels: HashMap<Int, Color> = HashMap()
    private val asciiChars: HashMap<Int, ASCIIChar> = HashMap()

    private var line: Int? = null

    //Array of characters
    private val chars: Array<ASCIIChar> = Array(113) {//TODO: Calculate the array size from the screen width
        return@Array ASCIIChar(' ', Color.BLACK)
    }

    fun line(line: Int): Line {
        this.line = line
        return this
    }

    /**
     * Add a character to the line specifying the position
     *
     * @param pos Char position
     * @param char Character
     */
    fun addChar(pos: Int, char: ASCIIChar) {
        chars[pos] = char
        asciiChars.set(pos, char)
    }

    /**
     * Add a pixel character to the line
     *
     * @param pos Pixel position
     * @param p Pixel
     */
    fun addPixel(pos: Int, p: Pixel) {
        chars[pos] = ASCIIChar(' ', Color.GRAY)
        pixels.set(pos, p.color)
    }

    /**
     * Clear the line
     */
    fun clear() {
        for (i in chars.indices) {
            chars[i] = ASCIIChar(' ', Color.BLACK)
        }
    }

    /**
     * Render the final string
     */
    fun render() {
        val painter = SimpleAttributeSet()

        //Loop through all characters
        for (i in chars.indices) {
            StyleConstants.setForeground(painter, chars[i].color)

            displayWindow.textComponent.insertString(line!!*113+i, chars[i].char.toString(), painter)
        }

        //Loop through every pixel and assign its respective color
        pixels.forEach {
            StyleConstants.setBackground(painter, it.component2())

            displayWindow.textComponent.insertString(line!!*113+it.component1(), " ", painter)
        }

        //Render the final line
        displayWindow.textComponent.insertString(line!!*113+112, "\n", painter)
    }

}