package dev.iconpippi.asciicraft.engine.console

import java.awt.Color
import java.awt.Font
import javax.swing.JFrame
import javax.swing.JTextArea

class Console(private val width: Int, private val height: Int, name: String) {

    private val mainFrame = JFrame(name)
    private val pixelArea = JTextArea()

    val lines: Array<Line> = Array(54) {
        return@Array Line()
    }

    fun setUp() {

        mainFrame.contentPane.layout = null
        mainFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        mainFrame.setSize(width, height)
        mainFrame.isResizable = false

        mainFrame.contentPane.background = Color.BLACK

        pixelArea.font = Font("Courier New", Font.BOLD, 12)

        pixelArea.setBounds(0,0, width, height)
        pixelArea.background = Color.BLACK

        pixelArea.isEditable = false

        mainFrame.contentPane.add(pixelArea)

    }

    fun show() {
        mainFrame.isVisible = true
    }

    fun addLine(line: String) {
        pixelArea.append(line)
    }


}