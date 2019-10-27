package dev.iconpippi.asciicraft.game

import dev.iconpippi.asciicraft.engine.WindowManager
import dev.iconpippi.asciicraft.game.gui.MainMenu
import java.io.File

/**
 * 19/9/2019
 * Main class for AsciiCraft game
 *
 * @author IconPippi
 */
object AsciiCraft {

    val gameFiles: File = File("asciicraft")

    /**
     * Start the game
     */
    fun start() {
        WindowManager.createDisplay(true)

        MainMenu.init().draw(true)

        if (!gameFiles.exists()) gameFiles.mkdir()
    }

}