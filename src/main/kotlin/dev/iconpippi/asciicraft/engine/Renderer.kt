package dev.iconpippi.asciicraft.engine

import dev.iconpippi.asciicraft.engine.display.DisplayWindow
import dev.iconpippi.asciicraft.engine.display.components.ASCIIChar
import dev.iconpippi.asciicraft.engine.display.components.Pixel
import java.awt.Color
import java.io.File
import java.nio.file.Files

/**
 * 19/9/2019
 * Manages all display rendering aspects
 *
 * @author IconPippi
 */
object Renderer {

    lateinit var DISPLAY_WINDOW: DisplayWindow
    
    /**
     * Render the screen
     */
    fun renderScreen() {
        for (i in DISPLAY_WINDOW.lines.indices) {
            DISPLAY_WINDOW.lines[i].line(i)
            DISPLAY_WINDOW.lines[i].render()
        }
    }

    /**
     * Clear the screen
     */
    fun clearScreen() {
        DISPLAY_WINDOW.clear()
        DISPLAY_WINDOW.lines.forEach {
            it.clear()
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
        DISPLAY_WINDOW.lines[y].addPixel(x, Pixel(color))
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
        DISPLAY_WINDOW.lines[y].addChar(x, ASCIIChar(char, color))
    }

    /**
     * Draw a string
     *
     * @param x X position
     * @param y Y position
     * @param string String
     * @param color Color
     */
    fun drawString(x: Int, y: Int, string: String, color: Color) {
        for (i in string.indices) {
            drawChar(x+1, y, string[i], color)
        }
    }

    /**
    * Draw the text contained in a given file
    *
    * @param x X pos
    * @param y Y pos
    * @param resource Target file
    * @param color Color
    */
    fun drawFile(x: Int, y: Int, resource: File, color: Color) {
        val lines = Files.readAllLines(resource.toPath())

        drawLines(x, y, lines, color)
    }

    /**
     * Draw a list of lines
     * The lines will be drawn from top to bottom
     *
     * @param x X pos
     * @param y Pos
     * @param lines Lines
     * @param color Color
     */
    fun drawLines(x: Int, y: Int, lines: List<String>, color: Color) {
        for (line: Int in lines.indices) {
            for (charPos in lines[line].indices) {
                drawChar(x+charPos, y+line,
                    lines[line].toCharArray()[charPos],
                    color)
            }
        }
    }

    /**
     * Draw a pixels rectangle
     *
     * @param x1 First corner X
     * @param y1 First corner Y
     * @param x2 Second corner X
     * @param y2 Second corner Y
     * @param color Color
     */
    fun drawPixelRectangle(x1: Int, y1: Int, x2: Int, y2: Int, color: Color) {
        //I sincerely apologize for your eyes
        if (y1 > y2) {
            if (x1 < x2) {
                for (i in y2 until y1) {
                    for (j in x1 until x2) {
                        DISPLAY_WINDOW.lines[i].addPixel(j, Pixel(color))
                    }
                }
            } else {
                for (i in y2 until y1) {
                    for (j in x2 until x1) {
                        DISPLAY_WINDOW.lines[i].addPixel(j, Pixel(color))
                    }
                }
            }
        } else {
            if (x1 < x2) {
                for (i in y1 until y2) {
                    for (j in x1 until x2) {
                        DISPLAY_WINDOW.lines[i].addPixel(j, Pixel(color))
                    }
                }
            } else {
                for (i in y1 until y2) {
                    for (j in x2 until x1) {
                        DISPLAY_WINDOW.lines[i].addPixel(j, Pixel(color))
                    }
                }
            }
        }
    }

    /**
     * Draw a characters rectangle
     *
     * @param x1 First corner X
     * @param y1 First corner Y
     * @param x2 Second corner X
     * @param y2 Second corner Y
     * @param char Character
     * @param color Color
     */
    fun drawCharRectangle(x1: Int, y1: Int, x2: Int, y2: Int, char: Char, color: Color) {
        //I sincerely apologize for your eyes
        if (y1 > y2) {
            if (x1 < x2) {
                for (i in y2 until y1) {
                    for (j in x1 until x2) {
                        DISPLAY_WINDOW.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            } else {
                for (i in y2 until y1) {
                    for (j in x2 until x1) {
                        DISPLAY_WINDOW.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            }
        } else {
            if (x1 < x2) {
                for (i in y1 until y2) {
                    for (j in x1 until x2) {
                        DISPLAY_WINDOW.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            } else {
                for (i in y1 until y2) {
                    for (j in x2 until x1) {
                        DISPLAY_WINDOW.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            }
        }
    }

}