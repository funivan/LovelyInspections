package com.funivan.phpstorm.lovelyPhpInspections.idea.markers

import com.funivan.phpstorm.lovelyPhpInspections.idea.LineMarker
import com.funivan.phpstorm.lovelyPhpInspections.inspectors.MethodInspector
import com.funivan.phpstorm.lovelyPhpInspections.inspectors.RandomSkippedInspector
import com.funivan.phpstorm.lovelyPhpInspections.random.RandomPhrase
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.psi.PsiElement
import com.jetbrains.php.lang.psi.elements.Method

class AwesomeMethodMarker : BaseMarker(
        RandomPhrase(
                listOf(
                        "This method is so cool",
                        "Cool method",
                        "Good one"
                )
        )
) {
    private val inspector = RandomSkippedInspector<Method>(0.40, MethodInspector())

    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        var result: LineMarkerInfo<PsiElement>? = null
        if (element is Method) {
            val nameNode = element.nameNode
            if (nameNode != null && inspector.isAwesome(element)) {
                result = LineMarker(nameNode.psi, icons, awesome)
            }
        }
        return result
    }

}