package com.funivan.phpstorm.lovelyPhpInspections.inspectors

interface InspectorInterface<T> {
    fun isAwesome(element: T): Boolean
}