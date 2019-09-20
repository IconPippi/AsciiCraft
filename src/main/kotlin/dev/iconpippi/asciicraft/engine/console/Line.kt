package dev.iconpippi.asciicraft.engine.console

import java.lang.StringBuilder

/**
 * 20/9/2019
 * ASCII display line
 *
 * @author IconPippi
 */
class Line {

    //var pixels: HashMap<Int, String> = HashMap()

    //Array of characters
    private val chars: Array<Char> = Array(113) {//TODO: Calculate the array size from the screen width
        return@Array ' '
    }

    /**
     * Add a character to the line specifying the position
     *
     * @param pos Char position
     * @param char Character
     */
    fun addChar(pos: Int, char: Char) {
        chars[pos] = char
    }

    /**
     * Add a pixel character to the line
     *
     * @param pos Pixel position
     * @param p Pixel
     */
    fun addPixel(pos: Int, p: Pixel) {
        chars[pos] = '█'
        //pixels.set(pos, p.color)
    }

    /**
     * Evaluate the final string
     */
    fun eval(): String {
        val sb = StringBuilder()

        chars.forEach {
            //if (it == '█') sb.append("$it</span>")
            /*else*/ sb.append(it)
        }
        //pixels.forEach {
        //    sb.insert(it.component1(), it.component2())
        //}

        return sb.toString()
    }

}