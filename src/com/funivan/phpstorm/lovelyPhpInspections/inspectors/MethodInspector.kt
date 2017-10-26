package com.funivan.phpstorm.lovelyPhpInspections.inspectors

import com.jetbrains.php.lang.psi.elements.Method


class MethodInspector : InspectorInterface<Method> {
    override fun isAwesome(method: Method): Boolean {
        return (
                method.parameters.size < 3
                        && !method.isStatic
                        && method.textLength < 400 && method.textLength < 100
                        && !method.modifier.isProtected
                        && method.parameters.none { it.isPassByRef }
                ); }
}