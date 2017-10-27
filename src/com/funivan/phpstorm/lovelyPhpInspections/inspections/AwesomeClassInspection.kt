package com.funivan.phpstorm.lovelyPhpInspections.inspections

import com.funivan.phpstorm.lovelyPhpInspections.inspectors.ClassInspector
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import com.jetbrains.php.lang.inspections.PhpInspection
import com.jetbrains.php.lang.psi.elements.PhpClass
import com.jetbrains.php.lang.psi.visitors.PhpElementVisitor

class AwesomeClassInspection : PhpInspection() {
    private val inspector = ClassInspector()
    override fun getShortName(): String {
        return "AwesomeClassInspection"
    }

    override fun buildVisitor(p0: ProblemsHolder, p1: Boolean): PsiElementVisitor {
        return object : PhpElementVisitor() {
            override fun visitPhpClass(clazz: PhpClass) {
                val name = clazz.nameNode;
                if (name != null) {
//                    if (inspector.isAwesome(clazz)) {
                        p0.registerProblem(name.psi, "Class ${clazz.fqn} is awesome")
//                    }
                }
            }
        }
    }
}