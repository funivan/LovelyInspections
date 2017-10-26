package com.funivan.phpstorm.lovelyPhpInspections.idea.markers

import com.funivan.phpstorm.lovelyPhpInspections.IconIds
import com.funivan.phpstorm.lovelyPhpInspections.idea.TooltipPhrase
import com.funivan.phpstorm.lovelyPhpInspections.lovely.CompositePhrase
import com.funivan.phpstorm.lovelyPhpInspections.lovely.Emoji
import com.funivan.phpstorm.lovelyPhpInspections.lovely.StandardPhrase
import com.funivan.phpstorm.lovelyPhpInspections.phrases.PhraseInterface
import com.funivan.phpstorm.lovelyPhpInspections.random.RandomItem
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.psi.PsiElement


abstract class BaseMarker(phrases: PhraseInterface) : LineMarkerProvider {
    val icons = RandomItem(IconIds.all())
    val awesome = TooltipPhrase(CompositePhrase(StandardPhrase(), Emoji(), phrases))

    override fun collectSlowLineMarkers(elements: MutableList<PsiElement>, result: MutableCollection<LineMarkerInfo<PsiElement>>) {

    }
}