package com.funivan.phpstorm.lovelyPhpInspections.random

import com.funivan.phpstorm.lovelyPhpInspections.phrases.PhraseInterface


open class RandomPhrase(items: List<String>) : RandomItem<String>(items), PhraseInterface {

    override fun toString(): String {
        return this.next()
    }

}
