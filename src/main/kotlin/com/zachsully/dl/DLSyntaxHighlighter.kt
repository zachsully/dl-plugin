package com.zachsully.dl

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.zachsully.dl.psi.DLTypes.*

class DLSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = DLLexerAdapter()
    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> =
        pack(map(tokenType))

    companion object {
        fun map(tokenType: IElementType?) : TextAttributesKey? {
            val neutral = createTextAttributesKey("KEYWORD",DefaultLanguageHighlighterColors.KEYWORD)
            val forData = createTextAttributesKey("KEYWORD",DefaultLanguageHighlighterColors.KEYWORD)
            val forCodata = createTextAttributesKey("KEYWORD",DefaultLanguageHighlighterColors.KEYWORD)
            var out : TextAttributesKey? = null
            when (tokenType) {
                CASE -> out = forData
                COCASE -> out = forCodata
                INDEX -> out = neutral
                DATA -> out = forData
                CODATA -> out = forCodata
                FIX -> out = neutral
                LET -> out = neutral
                LETREC -> out = neutral
                IN -> out = neutral
            }
            return out
        }
    }
}