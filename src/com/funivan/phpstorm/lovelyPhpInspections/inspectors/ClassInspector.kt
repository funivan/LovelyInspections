package com.funivan.phpstorm.lovelyPhpInspections.inspectors

import com.jetbrains.php.lang.psi.elements.PhpClass

class ClassInspector : InspectorInterface<PhpClass> {
    override fun isAwesome(phpClass: PhpClass): Boolean {
        return (
                !phpClass.isInterface && !phpClass.isAbstract && !phpClass.isAnonymous
                        && phpClass.methods.size < 10 && phpClass.methods.none { it.isStatic }
                        && phpClass.methods.none { it.modifier.isProtected }
                        && phpClass.fields.size < 10 && phpClass.fields.none { it.modifier.isStatic }
                )
    }
}