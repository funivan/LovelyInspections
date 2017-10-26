package com.funivan.phpstorm.lovelyPhpInspections.idea

import com.funivan.phpstorm.lovelyPhpInspections.phrases.PhraseInterface


class TooltipPhrase(private val origin: PhraseInterface) : PhraseInterface {
    override fun toString(): String {
        return "<html><body>$origin</body></html>"
    }
}