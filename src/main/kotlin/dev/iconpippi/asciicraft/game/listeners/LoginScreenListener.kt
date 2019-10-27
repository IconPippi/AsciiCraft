package dev.iconpippi.asciicraft.game.listeners

import dev.iconpippi.asciicraft.engine.WindowManager
import dev.iconpippi.asciicraft.game.art.other.Pointer
import dev.iconpippi.asciicraft.game.art.text.Text
import dev.iconpippi.asciicraft.game.event.Event
import dev.iconpippi.asciicraft.game.event.KeyEvent
import dev.iconpippi.asciicraft.game.gui.LoginScreen
import dev.iconpippi.asciicraft.game.gui.MainMenu
import java.awt.Color

/**
 * 27/9/2019
 * Login screen key listener
 *
 * @author IconPippi
 */
object LoginScreenListener : IListener {

    var password: String? = null
    var username: String? = null

    override fun handler(e: Event) {
        if (!LoginScreen.drawn && MainMenu.drawn) return
        e as KeyEvent

        Thread.sleep(200) //Add a little day cause it fucks up the whole rendering if you switch too quickly
        when (e.keyCode) {
            java.awt.event.KeyEvent.VK_UP -> {
                val pointer = LoginScreen.components[5] as Pointer

                try {
                    pointer.switch("up")
                    LoginScreen.refresh()
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_DOWN -> {
                val pointer = LoginScreen.components[5] as Pointer

                try {
                    pointer.switch("down")
                    LoginScreen.refresh()
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_LEFT -> {
                val pointer = LoginScreen.components[5] as Pointer

                try {
                    pointer.switch("left")
                    LoginScreen.refresh()
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_RIGHT -> {
                val pointer = LoginScreen.components[5] as Pointer

                try {
                    pointer.switch("right")
                    LoginScreen.refresh()
                } catch (e: Exception) {return}
            }
            java.awt.event.KeyEvent.VK_ENTER -> {
                val pointer = LoginScreen.components[5] as Pointer

                when ((pointer.getBindedArt()!! as Text).text) {
                    "BACK" -> {
                        LoginScreen.erase()
                        MainMenu.init().draw(true)
                    }
                    "LOGIN" -> {

                    }
                    "USERNAME:" -> {
                        fun listen(text: String) {
                            username = text
                            LoginScreen.components[6] = Text(50, 20, text, Color.GREEN)
                            LoginScreen.refresh()
                        }
                        WindowManager.createInputWindow("Enter Username", ::listen).show()
                    }
                    "PASSWORD:" -> {
                        fun listen(text: String) {
                            password = text

                            val sb = StringBuilder()
                            text.toCharArray().forEach { sb.append("*") } //Replace each char with a * to hide the text

                            LoginScreen.components[7] = Text(50, 30, sb.toString(), Color.GREEN)
                            LoginScreen.refresh()
                        }
                        WindowManager.createInputWindow("Enter Password", ::listen).show()
                    }
                }
            }
        }
    }

}