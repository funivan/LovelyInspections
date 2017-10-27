package com.funivan.phpstorm.lovelyPhpInspections.idea

import com.funivan.phpstorm.lovelyPhpInspections.random.RandomItem
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.util.Function
import javax.swing.Icon


class LineMarker<T : PsiElement>(
        psi: T,
        icons: RandomItem<Icon>,
        awesome: TooltipPhrase
) : LineMarkerInfo<T>(
        psi,
        psi.textRange,
        icons.next(),
        10,
        Function { awesome.toString() },
        null,
        GutterIconRenderer.Alignment.RIGHT
)
