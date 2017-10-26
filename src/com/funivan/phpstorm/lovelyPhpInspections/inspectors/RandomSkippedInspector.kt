package com.funivan.phpstorm.lovelyPhpInspections.inspectors

import java.util.*

class RandomSkippedInspector<T>(
        private val probe: Double,
        private val origin: InspectorInterface<T>
) : InspectorInterface<T> {
    private val rand = Random()

    override fun isAwesome(item: T): Boolean {
        var result = false
        if (this.rand.nextDouble() < this.probe) {
            result = origin.isAwesome(item)
        }
        return result
    }
}
