package com.funivan.phpstorm.lovelyPhpInspections.lovely

import com.funivan.phpstorm.lovelyPhpInspections.random.RandomPhrase


class Emoji : RandomPhrase(
        listOf<String>(
                /* 👏  */ "\uD83D\uDC4F",
                /* 🤘 */  "\uD83E\uDD18",
                /* 👌 */  "\uD83D\uDC4C",
                /* 👍 */  "\uD83D\uDC4D",
                /* 😇  */ "\uD83D\uDE07",
                /* 🙂  */ "\uD83D\uDE42",
                /* 😊 */ "\uD83D\uDE0A",
                /* 😍 */ "\uD83D\uDE0D"
        )
)