package com.funivan.phpstorm.lovelyPhpInspections.idea

import com.funivan.phpstorm.lovelyPhpInspections.random.RandomItem
import com.intellij.codeInsight.daemon.GutterIconNavigationHandler
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.util.Function
import java.awt.event.MouseEvent
import javax.swing.Icon
import javax.swing.JOptionPane


class LineMarker<T : PsiElement>(
        psi: T,
        icons: RandomItem<Icon>,
        private val awesome: TooltipPhrase
) : LineMarkerInfo<T>(
        psi,
        psi.textRange,
        icons.next(),
        10,
        Function { awesome.toString() },
        null,
        GutterIconRenderer.Alignment.LEFT
) {

    override fun getNavigationHandler(): GutterIconNavigationHandler<T> {
        return object : GutterIconNavigationHandler<T> {
            override fun navigate(mouseEvent: MouseEvent, p1: T) {
                
                JOptionPane.showMessageDialog(
                        null,
                        awesome.toString(),
                        "Awesome",
                        JOptionPane.DEFAULT_OPTION
                )


            }
        }
    }
}
