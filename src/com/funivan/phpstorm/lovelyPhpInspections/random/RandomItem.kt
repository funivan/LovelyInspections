package com.funivan.phpstorm.lovelyPhpInspections.random

import java.util.*

open class RandomItem<out T>(private val items: List<T>) : RandomItemInterface<T> {
    private val rand = Random()
    override fun next(): T {
        val index = rand.nextInt(items.size)
        return items[index]
    }
}