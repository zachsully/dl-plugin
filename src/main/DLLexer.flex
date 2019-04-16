package com.zachsully.dl.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.zachsully.dl.psi.DLTypes.*;

%%

%{
  public DLLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class DLLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
NUMBER=[0-9]+
ID=[a-zA-Z_0-9]+
LINE_COMMENT=--.*
BLOCK_COMMENT=\{-(.|\n)*-}

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "--"                 { return DASH_DASH; }
  "{-"                 { return LBRACE_DASH; }
  "-}"                 { return DASH_RBRACE; }
  "Int"                { return INT; }
  "+"                  { return PLUS; }
  "codata"             { return CODATA; }
  "data"               { return DATA; }
  "index"              { return INDEX; }
  "cocase"             { return COCASE; }
  "case"               { return CASE; }
  "fix"                { return FIX; }
  "let"                { return LET; }
  "letrec"             { return LETREC; }
  "="                  { return EQ; }
  "in"                 { return IN; }
  "#"                  { return HASH; }
  "_"                  { return UNDERSCORE; }
  "->"                 { return ARR; }
  "=>"                 { return DARR; }
  "{"                  { return LBRACE; }
  "}"                  { return RBRACE; }
  "("                  { return LPAREN; }
  ")"                  { return RPAREN; }
  "["                  { return LBRACK; }
  "]"                  { return RBRACK; }
  ","                  { return COMMA; }
  "|"                  { return MID; }
  ":"                  { return COLON; }

  {SPACE}              { return SPACE; }
  {NUMBER}             { return NUMBER; }
  {ID}                 { return ID; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
