package com.zachsully.dl

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.zachsully.dl.parser.DLParser
import com.zachsully.dl.psi.DLFile
import com.zachsully.dl.psi.DLTypes

class DLParserDefinition : ParserDefinition {
    override fun getCommentTokens(): TokenSet =
        TokenSet.create(DLTypes.LINE_COMMENT,DLTypes.BLOCK_COMMENT)

    override fun getWhitespaceTokens(): TokenSet =
        TokenSet.create(TokenType.WHITE_SPACE)

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode?): PsiElement =
        DLTypes.Factory.createElement(node)

    override fun createLexer(project: Project?): Lexer = DLLexerAdapter()
    override fun createParser(project: Project?): PsiParser = DLParser()
    override fun createFile(viewProvider: FileViewProvider): PsiFile =
        DLFile(viewProvider)

    override fun getFileNodeType(): IFileElementType = IFileElementType(DLLanguage)
}