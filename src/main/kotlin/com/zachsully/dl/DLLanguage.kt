package com.zachsully.dl

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType

object DLLanguage : Language("DL", "text/dl", "text/x-dl", "application/x-dl") {
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "DL"

    // This line is not mentioned in the tutorial, but is necessary for the lexer and parser
    override fun getAssociatedFileType(): LanguageFileType? = DLFileType
}