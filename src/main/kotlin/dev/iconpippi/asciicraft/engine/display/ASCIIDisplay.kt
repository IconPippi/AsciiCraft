package dev.iconpippi.asciicraft.engine.display

import dev.iconpippi.asciicraft.engine.display.components.Line
import java.awt.Color
import java.awt.Font
import javax.swing.JFrame
import javax.swing.JTextPane
import javax.swing.text.StyledDocument

/**
 * 19/9/2019
 * This class represents the game screen
 *
 * @param width Screen width
 * @param height Screen height
 * @param name Window name
 *
 * @author IconPippi
 */
class ASCIIDisplay(private val width: Int, private val height: Int, name: String) {

    //Swing components
    private val mainFrame = JFrame(name)
    private val pixelArea = JTextPane()

    /** ASCII text component */
    val textComponent: StyledDocument = pixelArea.styledDocument

    /**
     * The display is divided in an array of lines
     */
    val lines: Array<Line> = Array(54) {//TODO: Calculate the array size from the height
        return@Array Line(this)
    }

    /**
     * Set up the screen
     */
    fun setUp() {

        mainFrame.contentPane.layout = null
        mainFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        mainFrame.setSize(width, height)
        mainFrame.isResizable = false

        mainFrame.contentPane.background = Color.BLACK

        //mainFrame.iconImage = Toolkit.getDefaultToolkit().getImage(this.javaClass.classLoader.getResource("src/main/resources/AsciiCraftLogo.png"))
        pixelArea.addKeyListener(KeyListener)

        pixelArea.font = Font("Courier New", Font.BOLD, 12)

        pixelArea.setBounds(0,0, width, height)
        pixelArea.background = Color.BLACK

        pixelArea.isEditable = false

        mainFrame.contentPane.add(pixelArea)

    }

    /**
     * Open the a new ASCII display window
     */
    fun show() {
        mainFrame.isVisible = true
    }

    /**
     * Clear the display
     */
    fun clear() {
        pixelArea.text = ""
    }

    /**
     * Set the background color
     */
    fun setBackground(color: Color) {
        pixelArea.background = color
    }

}