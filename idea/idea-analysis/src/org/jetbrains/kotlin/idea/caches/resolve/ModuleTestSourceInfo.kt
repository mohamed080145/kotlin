/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.caches.resolve

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.idea.caches.project.IdeaModuleInfo
import org.jetbrains.kotlin.idea.caches.project.getNullableModuleInfo

@Deprecated(
    "Temporary interface to support binary compatibility in other plugins. " +
            "Works only for instanceof check. Will be removed in 1.2.60.",
    ReplaceWith("org.jetbrains.kotlin.idea.caches.project.ModuleTestSourceInfo"),
    level = DeprecationLevel.ERROR
)
interface ModuleTestSourceInfo

@Deprecated(
    "Temporary function to support binary compatibility after for other plugins after move." +
            "Will be removed in 1.2.60.",
    ReplaceWith("org.jetbrains.kotlin.idea.caches.project.getNullableModuleInfo"),
    level = DeprecationLevel.ERROR
)
fun PsiElement.getNullableModuleInfo(): IdeaModuleInfo? = this.getNullableModuleInfo()
