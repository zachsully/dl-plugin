package com.zachsully.dl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.zachsully.dl.psi.DLTypes;
import com.intellij.psi.TokenType;

%%

%class DLLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]
BlockComment   = "{-" [^*] ~"-}"
LineComment     = "--" {InputCharacter}* {LineTerminator}?
Identifier = [:jletter:] [:jletterdigit:]*
IntegerLiteral = [0-9][0-9]*

%%

<YYINITIAL> {
    "--"             { return DLTypes.DASH_DASH; }
    "{-"             { return DLTypes.LBRACE_DASH; }
    "-}"             { return DLTypes.DASH_RBRACE; }
    "Int"            { return DLTypes.INT; }
    "+"              { return DLTypes.PLUS; }
    "codata"         { return DLTypes.CODATA; }
    "data"           { return DLTypes.DATA; }
    "index"          { return DLTypes.INDEX; }
    "cocase"         { return DLTypes.COCASE; }
    "case"           { return DLTypes.CASE; }
    "fix"            { return DLTypes.FIX; }
    "let"            { return DLTypes.LET; }
    "letrec"         { return DLTypes.LETREC; }
    "="              { return DLTypes.EQ; }
    "in"             { return DLTypes.IN; }
    "#"              { return DLTypes.HASH; }
    "_"              { return DLTypes.UNDERSCORE; }
    "->"             { return DLTypes.ARR; }
    "=>"             { return DLTypes.DARR; }
    "{"              { return DLTypes.LBRACE; }
    "}"              { return DLTypes.RBRACE; }
    "("              { return DLTypes.LPAREN; }
    ")"              { return DLTypes.RPAREN; }
    "["              { return DLTypes.LBRACK; }
    "]"              { return DLTypes.RBRACK; }
    ","              { return DLTypes.COMMA; }
    "|"              { return DLTypes.MID; }
    ":"              { return DLTypes.COLON; }
    {WhiteSpace}     {}
    {IntegerLiteral} { return DLTypes.NUMBER; }
    {Identifier}     { return DLTypes.ID; }
    {BlockComment}   {}
    {LineComment}    {}

}