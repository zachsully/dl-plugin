package com.zachsully.dl

import com.intellij.lexer.FlexAdapter

class DLLexerAdapter : FlexAdapter(DLLexer(null))