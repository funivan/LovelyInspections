package com.funivan.phpstorm.lovelyPhpInspections

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object IconIds {
    private val angellist = IconLoader.getIcon("icons/angellist.png")
    val handPeace = IconLoader.getIcon("icons/hand-peace-o.png")
    fun all(): List<Icon> {
        return listOf<Icon>(
                angellist,
                handPeace,
                IconLoader.getIcon("icons/hand-spock-o.png"),
                IconLoader.getIcon("icons/heart.png"),
                IconLoader.getIcon("icons/smile-o.png"),
                IconLoader.getIcon("icons/star.png"),
                IconLoader.getIcon("icons/thumbs-o-up.png")
        )
    }
}