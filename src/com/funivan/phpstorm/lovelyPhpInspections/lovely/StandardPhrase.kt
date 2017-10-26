package com.funivan.phpstorm.lovelyPhpInspections.lovely

import com.funivan.phpstorm.lovelyPhpInspections.random.RandomPhrase


class StandardPhrase : RandomPhrase(
        listOf<String>(
                "Nice work dude.",
                "Nice work man.",
                "Just awesome.",
                "Well done.",
                "Good job.",
                "Awesome work."
        )
)