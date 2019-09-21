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
                        asciiDisplay.lines[i].addPixel(j, Pixel(color))
                    }
                }
            } else {
                for (i in y2 until y1) {
                    for (j in x2 until x1) {
                        asciiDisplay.lines[i].addPixel(j, Pixel(color))
                    }
                }
            }
        } else {
            if (x1 < x2) {
                for (i in y1 until y2) {
                    for (j in x1 until x2) {
                        asciiDisplay.lines[i].addPixel(j, Pixel(color))
                    }
                }
            } else {
                for (i in y1 until y2) {
                    for (j in x2 until x1) {
                        asciiDisplay.lines[i].addPixel(j, Pixel(color))
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
                        asciiDisplay.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            } else {
                for (i in y2 until y1) {
                    for (j in x2 until x1) {
                        asciiDisplay.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            }
        } else {
            if (x1 < x2) {
                for (i in y1 until y2) {
                    for (j in x1 until x2) {
                        asciiDisplay.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            } else {
                for (i in y1 until y2) {
                    for (j in x2 until x1) {
                        asciiDisplay.lines[i].addChar(j, ASCIIChar(char, color))
                    }
                }
            }
        }
    }

}