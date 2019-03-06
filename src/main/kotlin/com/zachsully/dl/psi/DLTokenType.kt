package com.zachsully.dl.psi

import com.zachsully.dl.DLLanguage
import com.intellij.psi.tree.IElementType

class DLTokenType(debugName: String)
    : IElementType(debugName,DLLanguage) {
    override fun toString(): String = "DLTokenType." + super.toString()
}

