package com.zachsully.dl

import com.zachsully.dl.DLFileType
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

fun foo(s: String) : String = s

class DLFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(ftc: FileTypeConsumer) {
        ftc.consume(DLFileType, DLFileType.DEFAULTS.EXTENSION)
    }
}