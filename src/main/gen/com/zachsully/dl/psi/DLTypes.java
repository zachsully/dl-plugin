// This is a generated file. Not intended for manual editing.
package com.zachsully.dl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.zachsully.dl.psi.impl.*;

public interface DLTypes {

  IElementType ADD_TERM = new DLElementType("ADD_TERM");
  IElementType ALT = new DLElementType("ALT");
  IElementType ALTS = new DLElementType("ALTS");
  IElementType ANN_TERM = new DLElementType("ANN_TERM");
  IElementType APP_TERM = new DLElementType("APP_TERM");
  IElementType APP_TYPE = new DLElementType("APP_TYPE");
  IElementType ARR_TYPE = new DLElementType("ARR_TYPE");
  IElementType CASE_TERM = new DLElementType("CASE_TERM");
  IElementType COALT = new DLElementType("COALT");
  IElementType COALTS = new DLElementType("COALTS");
  IElementType COALTS_TERM = new DLElementType("COALTS_TERM");
  IElementType COCASE_TERM = new DLElementType("COCASE_TERM");
  IElementType CONSTRAINT = new DLElementType("CONSTRAINT");
  IElementType CONSTRAINTS = new DLElementType("CONSTRAINTS");
  IElementType COPATTERN = new DLElementType("COPATTERN");
  IElementType COPATTERN_1 = new DLElementType("COPATTERN_1");
  IElementType COPATTERN_ATOM = new DLElementType("COPATTERN_ATOM");
  IElementType COPATTERN_P = new DLElementType("COPATTERN_P");
  IElementType DECL = new DLElementType("DECL");
  IElementType DECLS = new DLElementType("DECLS");
  IElementType FIX_TERM = new DLElementType("FIX_TERM");
  IElementType INJ = new DLElementType("INJ");
  IElementType INJS = new DLElementType("INJS");
  IElementType I_DS = new DLElementType("I_DS");
  IElementType LET_TERM = new DLElementType("LET_TERM");
  IElementType LIT_TYPE = new DLElementType("LIT_TYPE");
  IElementType NUM_TERM = new DLElementType("NUM_TERM");
  IElementType OBS_CTX = new DLElementType("OBS_CTX");
  IElementType OBS_CTX_1 = new DLElementType("OBS_CTX_1");
  IElementType OBS_CTX_ATOM = new DLElementType("OBS_CTX_ATOM");
  IElementType OBS_CTX_P = new DLElementType("OBS_CTX_P");
  IElementType PAREN_TERM = new DLElementType("PAREN_TERM");
  IElementType PAREN_TYPE = new DLElementType("PAREN_TYPE");
  IElementType PATTERN = new DLElementType("PATTERN");
  IElementType PATTERN_ATOM = new DLElementType("PATTERN_ATOM");
  IElementType PROJ = new DLElementType("PROJ");
  IElementType PROJS = new DLElementType("PROJS");
  IElementType PROMPT_TERM = new DLElementType("PROMPT_TERM");
  IElementType TERM = new DLElementType("TERM");
  IElementType TYPE = new DLElementType("TYPE");
  IElementType VAR_TERM = new DLElementType("VAR_TERM");
  IElementType VAR_TYPE = new DLElementType("VAR_TYPE");

  IElementType ARR = new DLTokenType("->");
  IElementType BLOCK_COMMENT = new DLTokenType("BLOCK_COMMENT");
  IElementType CASE = new DLTokenType("case");
  IElementType COCASE = new DLTokenType("cocase");
  IElementType CODATA = new DLTokenType("codata");
  IElementType COLON = new DLTokenType(":");
  IElementType COMMA = new DLTokenType(",");
  IElementType DARR = new DLTokenType("=>");
  IElementType DASH_DASH = new DLTokenType("--");
  IElementType DASH_RBRACE = new DLTokenType("-}");
  IElementType DATA = new DLTokenType("data");
  IElementType EQ = new DLTokenType("=");
  IElementType FIX = new DLTokenType("fix");
  IElementType HASH = new DLTokenType("#");
  IElementType ID = new DLTokenType("ID");
  IElementType IN = new DLTokenType("in");
  IElementType INDEX = new DLTokenType("index");
  IElementType INT = new DLTokenType("Int");
  IElementType LBRACE = new DLTokenType("{");
  IElementType LBRACE_DASH = new DLTokenType("{-");
  IElementType LBRACK = new DLTokenType("[");
  IElementType LET = new DLTokenType("let");
  IElementType LETREC = new DLTokenType("letrec");
  IElementType LINE_COMMENT = new DLTokenType("LINE_COMMENT");
  IElementType LPAREN = new DLTokenType("(");
  IElementType MID = new DLTokenType("|");
  IElementType NUMBER = new DLTokenType("NUMBER");
  IElementType PLUS = new DLTokenType("+");
  IElementType RBRACE = new DLTokenType("}");
  IElementType RBRACK = new DLTokenType("]");
  IElementType RPAREN = new DLTokenType(")");
  IElementType UNDERSCORE = new DLTokenType("_");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_TERM) {
        return new DLAddTermImpl(node);
      }
      else if (type == ALT) {
        return new DLAltImpl(node);
      }
      else if (type == ALTS) {
        return new DLAltsImpl(node);
      }
      else if (type == ANN_TERM) {
        return new DLAnnTermImpl(node);
      }
      else if (type == APP_TERM) {
        return new DLAppTermImpl(node);
      }
      else if (type == APP_TYPE) {
        return new DLAppTypeImpl(node);
      }
      else if (type == ARR_TYPE) {
        return new DLArrTypeImpl(node);
      }
      else if (type == CASE_TERM) {
        return new DLCaseTermImpl(node);
      }
      else if (type == COALT) {
        return new DLCoaltImpl(node);
      }
      else if (type == COALTS) {
        return new DLCoaltsImpl(node);
      }
      else if (type == COALTS_TERM) {
        return new DLCoaltsTermImpl(node);
      }
      else if (type == COCASE_TERM) {
        return new DLCocaseTermImpl(node);
      }
      else if (type == CONSTRAINT) {
        return new DLConstraintImpl(node);
      }
      else if (type == CONSTRAINTS) {
        return new DLConstraintsImpl(node);
      }
      else if (type == COPATTERN) {
        return new DLCopatternImpl(node);
      }
      else if (type == COPATTERN_1) {
        return new DLCopattern1Impl(node);
      }
      else if (type == COPATTERN_ATOM) {
        return new DLCopatternAtomImpl(node);
      }
      else if (type == COPATTERN_P) {
        return new DLCopatternPImpl(node);
      }
      else if (type == DECL) {
        return new DLDeclImpl(node);
      }
      else if (type == DECLS) {
        return new DLDeclsImpl(node);
      }
      else if (type == FIX_TERM) {
        return new DLFixTermImpl(node);
      }
      else if (type == INJ) {
        return new DLInjImpl(node);
      }
      else if (type == INJS) {
        return new DLInjsImpl(node);
      }
      else if (type == I_DS) {
        return new DLIDsImpl(node);
      }
      else if (type == LET_TERM) {
        return new DLLetTermImpl(node);
      }
      else if (type == LIT_TYPE) {
        return new DLLitTypeImpl(node);
      }
      else if (type == NUM_TERM) {
        return new DLNumTermImpl(node);
      }
      else if (type == OBS_CTX) {
        return new DLObsCtxImpl(node);
      }
      else if (type == OBS_CTX_1) {
        return new DLObsCtx1Impl(node);
      }
      else if (type == OBS_CTX_ATOM) {
        return new DLObsCtxAtomImpl(node);
      }
      else if (type == OBS_CTX_P) {
        return new DLObsCtxPImpl(node);
      }
      else if (type == PAREN_TERM) {
        return new DLParenTermImpl(node);
      }
      else if (type == PAREN_TYPE) {
        return new DLParenTypeImpl(node);
      }
      else if (type == PATTERN) {
        return new DLPatternImpl(node);
      }
      else if (type == PATTERN_ATOM) {
        return new DLPatternAtomImpl(node);
      }
      else if (type == PROJ) {
        return new DLProjImpl(node);
      }
      else if (type == PROJS) {
        return new DLProjsImpl(node);
      }
      else if (type == PROMPT_TERM) {
        return new DLPromptTermImpl(node);
      }
      else if (type == TERM) {
        return new DLTermImpl(node);
      }
      else if (type == TYPE) {
        return new DLTypeImpl(node);
      }
      else if (type == VAR_TERM) {
        return new DLVarTermImpl(node);
      }
      else if (type == VAR_TYPE) {
        return new DLVarTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
