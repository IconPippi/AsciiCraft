package dev.iconpippi.asciicraft.game

/**
 * 21/9/2019
 * ASCII art interface
 *
 * @author IconPippi
 */
interface ASCIIArt {

    /**
     * Draw the art
     *
     * @param render Automatically render once finished drawing
     */
    fun draw(render: Boolean)

}