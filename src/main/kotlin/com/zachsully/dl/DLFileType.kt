package com.zachsully.dl

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object DLFileType : LanguageFileType(DLLanguage) {

    object DEFAULTS {
        val EXTENSION : String = "dl"
    }

    override fun getDefaultExtension() : String = DEFAULTS.EXTENSION
    override fun getIcon(): Icon? = DLIcons.FILE_ICON
    override fun getName(): String = "DL"
    override fun getDescription(): String = "DL language files"
}
