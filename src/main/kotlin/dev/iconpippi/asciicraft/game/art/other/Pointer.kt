package dev.iconpippi.asciicraft.game.art.other

import dev.iconpippi.asciicraft.engine.Renderer
import dev.iconpippi.asciicraft.game.art.ASCIIArt
import java.awt.Color
import java.lang.AssertionError
import kotlin.collections.ArrayList
import java.util.TreeSet


/**
 * 29/9/2019
 * Pointer ASCII art
 *
 * @author IconPippi
 */
class Pointer(override var xPos: Int, override var yPos: Int) : ASCIIArt {

    private val pointer: ArrayList<String> = ArrayList()

    val targets: ArrayList<ASCIIArt> = ArrayList()

    init {
        pointer.add("\\\\  ")
        pointer.add(" \\\\ ")
        pointer.add(" // ")
        pointer.add("// ")
    }

    override fun draw(render: Boolean) {
        Renderer.drawLines(xPos, yPos, pointer, Color.YELLOW)

        if (render) Renderer.renderScreen()
    }

    /**
     * Add a target for this pointer
     *
     * @param art Art target
     */
    fun addTarget(art: ASCIIArt) {
        targets.add(art)
    }

    /**
     * Switch target specifying a direction
     *
     * @param direction "up" or "down" are the two possible directions
     */
    fun switch(direction: String) {
        //*****************
        // YES I KNOW THIS IS SHITCODE
        // BUT I HAVE NO IDEA HOW IT WORKS
        // SO YEAH
        //*****************
        when (direction) {
            "up" -> {
                targets.sortBy {it.yPos}

                val values = TreeSet<Int>()
                for (i in 0 until targets.size) {
                    values.add(targets[i].yPos)
                }
                val lower = values.lower(yPos)

                if (yPos == targets[0].yPos) throw Exception("Already at the top of the list")
                else {
                    yPos = lower!!
                    xPos = targets.find {
                        it.yPos == lower
                    }!!.xPos - 5
                }
            }
            "down" -> {
                targets.sortBy {it.yPos}

                val values = TreeSet<Int>()
                for (i in 0 until targets.size) {
                    values.add(targets[i].yPos)
                }
                val higher = values.higher(yPos)

                if (yPos == targets[targets.lastIndex].yPos) throw Exception("Already at the bottom of the list")
                else {
                    yPos = higher!!
                    xPos = targets.find {
                        it.yPos == higher
                    }!!.xPos - 5
                }
            }
            "left" -> {
                val trgts = ArrayList<ASCIIArt>()
                targets.forEach {
                    if (it.yPos == yPos) trgts.add(it)
                }

                val values = TreeSet<Int>()
                for (i in 0 until trgts.size) {
                    values.add(trgts[i].xPos)
                }
                val lower = values.lower(xPos)

                if (xPos == trgts[0].xPos) throw Exception("Already at the left extreme of the list")
                else {
                    xPos = lower!! - 5
                }
            }
            "right" -> {
                val trgts = ArrayList<ASCIIArt>()
                targets.forEach {
                    if (it.yPos == yPos) trgts.add(it)
                }

                val values = TreeSet<Int>()
                for (i in 0 until trgts.size) {
                    values.add(trgts[i].xPos)
                }
                val higher = values.higher(xPos+5)

                if (xPos == trgts[trgts.lastIndex].xPos) throw Exception("Already at the right extreme of the list")
                else {
                    xPos = higher!! - 5
                }
            }
        }
    }

    /**
     * Get the ascii art it is binded to
     *
     * @return Art it is binded to
     */
    fun getBindedArt(): ASCIIArt? {
        var art: ASCIIArt? = null

        targets.forEach {
            if (yPos == it.yPos && xPos == it.xPos-5)
                art = it
        }

        return art
    }

}