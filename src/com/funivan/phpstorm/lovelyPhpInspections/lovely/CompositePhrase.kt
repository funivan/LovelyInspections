package com.funivan.phpstorm.lovelyPhpInspections.lovely

import com.funivan.phpstorm.lovelyPhpInspections.phrases.PhraseInterface


class CompositePhrase(
        vararg private val items: PhraseInterface
) : PhraseInterface {

    override fun toString(): String {
        return items.joinToString(separator = " ")
    }
}