package dev.iconpippi.asciicraft.engine

import dev.iconpippi.asciicraft.engine.console.Console
import dev.iconpippi.asciicraft.engine.console.Pixel

//TODO: Color rendering
object Renderer {

    private val console: Console = ConsoleManager.console

    fun renderScreen() {
        console.lines.forEach {
            //console.addLine("<html>${it.eval()}</html>\r\n")
            console.addLine("${it.eval()}\r\n")
        }
    }

    fun drawPixel(x: Int, y: Int, ansiColor: String) {
        console.lines[y].addPixel(x, Pixel(ansiColor))
    }

    fun drawChar(x: Int, y: Int, char: Char) {
        console.lines[y].addChar(x, char)
    }

    private fun getPos(x: Int, y: Int): Int {
        val calc: Int = x
        for (i in 0 until y) {
            calc + 113
        }
        return calc
    }

}