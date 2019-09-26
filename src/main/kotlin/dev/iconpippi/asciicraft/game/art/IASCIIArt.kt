package dev.iconpippi.asciicraft.game.art

/**
 * 21/9/2019
 * ASCII art interface
 *
 * @author IconPippi
 */
interface IASCIIArt {

    /** Art X position */
    val xPos: Int
    /** Art Y position */
    val yPos: Int

    /**
     * Draw the art
     *
     * @param render Automatically render once finished drawing
     */
    fun draw(render: Boolean)

}