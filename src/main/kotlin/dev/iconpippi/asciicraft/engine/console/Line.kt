package dev.iconpippi.asciicraft.engine.console

import java.lang.StringBuilder

class Line {

    //var pixels: HashMap<Int, String> = HashMap()

    private val chars: Array<Char> = Array(113) {
        return@Array ' '
    }

    fun addChar(pos: Int, char: Char) {
        chars[pos] = char
    }

    fun addPixel(pos: Int, p: Pixel) {
        chars[pos] = '█'
        //pixels.set(pos, p.color)
    }

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