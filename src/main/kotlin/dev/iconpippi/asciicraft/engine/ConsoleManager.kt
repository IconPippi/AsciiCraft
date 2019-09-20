package dev.iconpippi.asciicraft.engine

import dev.iconpippi.asciicraft.engine.console.Console

object ConsoleManager {

    const val width: Int = 800
    const val height: Int = 800

    const val name: String = "AsciiCraft v0.1"

    val console: Console =
        Console(width, height, name)

    fun setupConsole() {
        console.setUp()
        console.show()
    }

}