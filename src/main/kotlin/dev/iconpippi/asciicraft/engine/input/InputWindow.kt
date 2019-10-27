package dev.iconpippi.asciicraft.engine.input

import java.awt.Color
import java.awt.Font
import javax.swing.JFrame
import javax.swing.JTextPane

/**
 * 27/10/2019
 * Text input box
 *
 * @param title Title of the box
 * @param inputListener Input handler function
 *
 * @author IconPippi
 */
class InputWindow(title: String, private val inputListener: (txt: String) -> Unit) {

    //Swing components
    private val mainFrame = JFrame(title)
    val pixelArea = JTextPane()

    private val fixedWidth = 200
    private val fixedHeight = 100

    init {
        mainFrame.contentPane.layout = null
        mainFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        mainFrame.setSize(fixedWidth, fixedHeight)
        mainFrame.isResizable = false

        mainFrame.contentPane.background = Color.BLACK
        mainFrame.contentPane.foreground = Color.WHITE

        pixelArea.addKeyListener(InputListener(this))

        pixelArea.font = Font("Courier New", Font.BOLD, 19)

        pixelArea.setBounds(0,0, fixedWidth, fixedHeight)
        pixelArea.background = Color.BLACK

        pixelArea.isEditable = true

        mainFrame.contentPane.add(pixelArea)
    }

    /**
     * Show the box
     */
    fun show() {
        mainFrame.isVisible = true
    }

    /**
     * Hide the box
     */
    fun hide() {
        mainFrame.isVisible = false
    }

    /**
     * Input handler
     */
    fun onInputReceived(input: String) = inputListener(input)

}