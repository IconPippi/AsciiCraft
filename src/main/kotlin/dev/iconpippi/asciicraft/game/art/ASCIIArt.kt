package dev.iconpippi.asciicraft.game.art

/**
 * 21/9/2019
 * ASCII art interface
 *
 * @author IconPippi
 */
abstract class ASCIIArt {

    /** Art X position */
    abstract val xPos: Int
    /** Art Y position */
    abstract val yPos: Int

    /**
     * Draw the art
     *
     * @param render Automatically render once finished drawing
     */
    abstract fun draw(render: Boolean)

}