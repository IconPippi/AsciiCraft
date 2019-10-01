package dev.iconpippi.asciicraft.game.art.text

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIIArt
import java.awt.Color
import java.lang.StringBuilder

/**
 * 28/9/2019
 * This class generates ASCII text art
 *
 * @param text The text you want to generate
 * @param color Text color
 *
 * @author IconPippi
 */
class Text(
    override var xPos: Int,
    override var yPos: Int,
    val text: String,
    private val color: Color
) : ASCIIArt {

    //Lines
    private val line1: StringBuilder = StringBuilder()
    private val line2: StringBuilder = StringBuilder()
    private val line3: StringBuilder = StringBuilder()
    private val line4: StringBuilder = StringBuilder()

    private val finalText: List<String>

    /**
     * Generate the text
     *
     * @return The text as a list of lines
     */
    private fun generateText(): List<String> {
        text.toCharArray().forEach {
            when (it.toLowerCase()) {
                'a' -> {
                    line1.append(" __  ")
                    line2.append("|__| ")
                    line3.append("|  | ")
                    line4.append("|  | ")
                }
                'b' -> {
                    line1.append(" __  ")
                    line2.append("|__/ ")
                    line3.append("|  \\ ")
                    line4.append("|__/ ")
                }
                'c' -> {
                    line1.append(" ___ ")
                    line2.append("|    ")
                    line3.append("|    ")
                    line4.append("|___ ")
                }
                'd' -> {
                    line1.append(" __  ")
                    line2.append("|  \\ ")
                    line3.append("|  | ")
                    line4.append("|__/ ")
                }
                'e' -> {
                    line1.append(" ___ ")
                    line2.append("|    ")
                    line3.append("|=== ")
                    line4.append("|___ ")
                }
                'f' -> {
                    line1.append(" ___ ")
                    line2.append("|___ ")
                    line3.append("|    ")
                    line4.append("|    ")
                }
                'g' -> {
                    line1.append(" ___ ")
                    line2.append("|    ")
                    line3.append("| __ ")
                    line4.append("|__| ")
                }
                'h' -> {
                    line1.append("     ")
                    line2.append("|__| ")
                    line3.append("|  | ")
                    line4.append("|  | ")
                }
                'i' -> {
                    line1.append("  ")
                    line2.append("| ")
                    line3.append("| ")
                    line4.append("| ")
                }
                'j' -> {
                    line1.append("     ")
                    line2.append("   | ")
                    line2.append("   | ")
                    line4.append("\\__/ ")
                }
                'k' -> {
                    line1.append("    ")
                    line2.append("|/  ")
                    line3.append("|\\  ")
                    line4.append("| \\")
                }
                'l' -> {
                    line1.append("     ")
                    line2.append("|    ")
                    line3.append("|    ")
                    line4.append("|___ ")
                }
                'm' -> {
                    line1.append("     ")
                    line2.append("|\\/| ")
                    line3.append("|  | ")
                    line4.append("|  | ")
                }
                'n' -> {
                    line1.append("     ")
                    line2.append("|\\ | ")
                    line3.append("| \\| ")
                    line4.append("|  | ")
                }
                'o' -> {
                    line1.append(" __  ")
                    line2.append("|  | ")
                    line3.append("|  | ")
                    line4.append("|__| ")
                }
                'p' -> {
                    line1.append(" __  ")
                    line2.append("|__| ")
                    line3.append("|    ")
                    line4.append("|    ")
                }
                'q' -> {
                    line1.append(" __  ")
                    line2.append("|  | ")
                    line3.append("|  | ")
                    line4.append("|__\\ ")
                }
                'r' -> {
                    line1.append(" __  ")
                    line2.append("|__| ")
                    line3.append("|\\   ")
                    line4.append("| \\  ")
                }
                's' -> {
                    line1.append(" __  ")
                    line2.append("|__  ")
                    line3.append("   | ")
                    line4.append(" __| ")
                }
                't' -> {
                    line1.append("____ ")
                    line2.append("  |  ")
                    line3.append("  |  ")
                    line4.append("  | ")
                }
                'u' -> {
                    line1.append("     ")
                    line2.append("|  | ")
                    line3.append("|  | ")
                    line4.append("|__| ")
                }
                'v' -> {
                    line1.append("     ")
                    line2.append("|  | ")
                    line3.append("\\  / ")
                    line4.append(" \\/  ")
                }
                'w' -> {
                    line1.append("     ")
                    line2.append("|  | ")
                    line3.append("|  | ")
                    line4.append("|/\\| ")
                }
                'x' -> {
                    line1.append("     ")
                    line2.append("\\  / ")
                    line3.append(" \\/  ")
                    line4.append(" /\\  ")
                }
                'y' -> {
                    line1.append("     ")
                    line2.append("\\  / ")
                    line3.append(" \\/  ")
                    line4.append(" |   ")
                }
                'z' -> {
                    line1.append(" ___ ")
                    line2.append("   / ")
                    line3.append("  /  ")
                    line4.append(" /__ ")
                }
                '(' -> {
                    line1.append("  ")
                    line2.append("/ ")
                    line3.append("|  ")
                    line4.append("\\ ")
                }
                ')' -> {
                    line1.append("   ")
                    line2.append("\\ ")
                    line3.append(" | ")
                    line4.append("/  ")
                }
                ' ' -> {
                    line1.append(" ")
                    line2.append(" ")
                    line4.append(" ")
                    line4.append(" ")
                }
            }
        }

        val list: ArrayList<String> = ArrayList()
        list.add(line1.toString())
        list.add(line2.toString())
        list.add(line3.toString())
        list.add(line4.toString())

        return list
    }

    init { finalText = generateText() }

    override fun draw(render: Boolean) {
        Renderer.drawLines(xPos, yPos, finalText, color)

        if (render) Renderer.renderScreen()
    }

}