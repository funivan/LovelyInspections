package com.funivan.phpstorm.lovelyPhpInspections.random

interface RandomItemInterface<out T> {
    fun next(): T
}