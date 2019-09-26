package dev.iconpippi.asciicraft.game.art

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.mainmenu.ASCIICraftLogo
import dev.iconpippi.asciicraft.game.art.mainmenu.LoginText
import dev.iconpippi.asciicraft.game.art.mainmenu.QuitText

/**
 * 26/9/2019
 * Manages all ASCII art pieces
 *
 * @author IconPippi
 */
object ArtManager {

    /**
     * Draw the main menu art components
     *
     * @param render True if you want to also render
     */
    fun drawMainMenu(render: Boolean) {
        //Gives a weird animation, its kinda cool tho
        ASCIICraftLogo(21, 3).draw(render)
        ASCIICraftTitle(30, 25).draw(render)
        LoginText.draw(render)
        QuitText.draw(render)
    }

    /**
     * Hide the main menu
     */
    fun hideMainMenu() {
        Renderer.clearScreen()
    }

}