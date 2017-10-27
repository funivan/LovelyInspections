package com.funivan.phpstorm.lovelyPhpInspections.idea.markers

import com.funivan.phpstorm.lovelyPhpInspections.idea.LineMarker
import com.funivan.phpstorm.lovelyPhpInspections.inspectors.ClassInspector
import com.funivan.phpstorm.lovelyPhpInspections.inspectors.RandomSkippedInspector
import com.funivan.phpstorm.lovelyPhpInspections.random.RandomPhrase
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.psi.PsiElement
import com.jetbrains.php.lang.psi.elements.PhpClass


class AwesomeClassMarker : BaseMarker(
        RandomPhrase(
                listOf(
                        "This class is cool",
                        "Cool class",
                        "Good one"
                )
        )
) {

    private val inspector = RandomSkippedInspector<PhpClass>(0.80, ClassInspector())

    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        var result: LineMarkerInfo<PsiElement>? = null
        if (element is PhpClass) {
            val nameNode = element.nameNode
            if (nameNode != null && inspector.isAwesome(element)) {
                result = LineMarker(nameNode.psi, icons, awesome)
            }
        }
        return result
    }

}