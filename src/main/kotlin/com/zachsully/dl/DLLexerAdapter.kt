package com.zachsully.dl

import com.intellij.lexer.FlexAdapter

class DLLexerAdapter : FlexAdapter(com.zachsully.dl.parser.DLLexer(null))