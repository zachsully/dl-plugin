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
            val keyword = createTextAttributesKey("KEYWORD",DefaultLanguageHighlighterColors.KEYWORD)
            var out : TextAttributesKey? = null
            when (tokenType) {
                CASE -> out = keyword
                COCASE -> out = keyword
                INDEX -> out = keyword
                DATA -> out = keyword
                CODATA -> out = keyword
                FIX -> out = keyword
                LET -> out = keyword
                LETREC -> out = keyword
                IN -> out = keyword
            }
            return out
        }
    }
}