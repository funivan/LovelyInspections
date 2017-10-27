package com.funivan.phpstorm.lovelyPhpInspections

import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.SeveritiesProvider
import com.intellij.icons.AllIcons
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import javax.swing.Icon


class AwesomeSeverityProvider : SeveritiesProvider() {
    override fun getSeveritiesHighlightInfoTypes(): MutableList<HighlightInfoType> {
        class T(severity: HighlightSeverity, attributesKey: TextAttributesKey)
            : HighlightInfoType.HighlightInfoTypeImpl(severity, attributesKey), HighlightInfoType.Iconable {

            override fun getIcon(): Icon {
                return AllIcons.General.InspectionsTypos
            }
        }
        return mutableListOf(
                T(
                        HighlightSeverity("AWESOME", 100),
                        TextAttributesKey.createTextAttributesKey("TYPO")
                )
        )
    }

}