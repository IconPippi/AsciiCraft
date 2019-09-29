package dev.iconpippi.asciicraft.game.art

/**
 * 21/9/2019
 * ASCII art interface
 *
 * @author IconPippi
 */
interface ASCIIArt {

    /** Art X position */
    var xPos: Int
    /** Art Y position */
    var yPos: Int

    /**
     * Draw the art
     *
     * @param render Automatically render once finished drawing
     */
    fun draw(render: Boolean)

}