package com.zachsully.dl.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.zachsully.dl.DLFileType
import com.zachsully.dl.DLIcons
import com.zachsully.dl.DLLanguage
import javax.swing.Icon

class DLFile(viewProvider : FileViewProvider)
    : PsiFileBase(viewProvider,DLLanguage) {
    override fun getFileType(): FileType = DLFileType
    override fun toString(): String = "DL File"
    override fun getIcon(flags: Int): Icon? = DLIcons.FILE_ICON
}