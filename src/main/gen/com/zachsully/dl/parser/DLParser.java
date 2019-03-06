// This is a generated file. Not intended for manual editing.
package com.zachsully.dl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.zachsully.dl.psi.DLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ALT) {
      r = Alt(b, 0);
    }
    else if (t == ALTS) {
      r = Alts(b, 0);
    }
    else if (t == COALT) {
      r = Coalt(b, 0);
    }
    else if (t == COALTS) {
      r = Coalts(b, 0);
    }
    else if (t == CONSTRAINT) {
      r = Constraint(b, 0);
    }
    else if (t == CONSTRAINTS) {
      r = Constraints(b, 0);
    }
    else if (t == COPATTERN) {
      r = Copattern(b, 0);
    }
    else if (t == COPATTERN_1) {
      r = Copattern1(b, 0);
    }
    else if (t == COPATTERN_ATOM) {
      r = CopatternAtom(b, 0);
    }
    else if (t == COPATTERN_P) {
      r = CopatternP(b, 0);
    }
    else if (t == DECL) {
      r = Decl(b, 0);
    }
    else if (t == DECLS) {
      r = Decls(b, 0);
    }
    else if (t == I_DS) {
      r = IDs(b, 0);
    }
    else if (t == INJ) {
      r = Inj(b, 0);
    }
    else if (t == INJS) {
      r = Injs(b, 0);
    }
    else if (t == OBS_CTX) {
      r = ObsCtx(b, 0);
    }
    else if (t == OBS_CTX_1) {
      r = ObsCtx1(b, 0);
    }
    else if (t == OBS_CTX_ATOM) {
      r = ObsCtxAtom(b, 0);
    }
    else if (t == OBS_CTX_P) {
      r = ObsCtxP(b, 0);
    }
    else if (t == PATTERN) {
      r = Pattern(b, 0);
    }
    else if (t == PATTERN_ATOM) {
      r = PatternAtom(b, 0);
    }
    else if (t == PROJ) {
      r = Proj(b, 0);
    }
    else if (t == PROJS) {
      r = Projs(b, 0);
    }
    else if (t == TERM) {
      r = Term(b, 0);
    }
    else if (t == TYPE) {
      r = Type(b, 0);
    }
    else if (t == TERM) {
      r = term(b, 0, -1);
    }
    else if (t == TYPE) {
      r = type(b, 0, -1);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Program(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(APP_TYPE, ARR_TYPE, LIT_TYPE, PAREN_TYPE,
      TYPE, VAR_TYPE),
    create_token_set_(ADD_TERM, ANN_TERM, APP_TERM, CASE_TERM,
      COALTS_TERM, COCASE_TERM, FIX_TERM, LET_TERM,
      NUM_TERM, PAREN_TERM, PROMPT_TERM, TERM,
      VAR_TERM),
  };

  /* ********************************************************** */
  // Pattern '->' Term
  public static boolean Alt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alt")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pattern(b, l + 1);
    r = r && consumeToken(b, ARR);
    r = r && Term(b, l + 1);
    exit_section_(b, m, ALT, r);
    return r;
  }

  /* ********************************************************** */
  // Alt '|' Alts
  //        | Alt
  public static boolean Alts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alts")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Alts_0(b, l + 1);
    if (!r) r = Alt(b, l + 1);
    exit_section_(b, m, ALTS, r);
    return r;
  }

  // Alt '|' Alts
  private static boolean Alts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Alt(b, l + 1);
    r = r && consumeToken(b, MID);
    r = r && Alts(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Copattern '->' Term
  public static boolean Coalt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Coalt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COALT, "<coalt>");
    r = Copattern(b, l + 1);
    r = r && consumeToken(b, ARR);
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Coalt ',' Coalts
  //          | Coalt
  public static boolean Coalts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Coalts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COALTS, "<coalts>");
    r = Coalts_0(b, l + 1);
    if (!r) r = Coalt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Coalt ',' Coalts
  private static boolean Coalts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Coalts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Coalt(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Coalts(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Type '=' Type
  public static boolean Constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, "<constraint>");
    r = Type(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Constraint ',' Constraints
  //               | Constraint
  public static boolean Constraints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constraints")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINTS, "<constraints>");
    r = Constraints_0(b, l + 1);
    if (!r) r = Constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Constraint ',' Constraints
  private static boolean Constraints_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constraints_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constraint(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Constraints(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Copattern1 CopatternP?
  public static boolean Copattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Copattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COPATTERN, "<copattern>");
    r = Copattern1(b, l + 1);
    r = r && Copattern_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CopatternP?
  private static boolean Copattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Copattern_1")) return false;
    CopatternP(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID CopatternAtom
  //              | CopatternAtom
  public static boolean Copattern1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Copattern1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COPATTERN_1, "<copattern 1>");
    r = Copattern1_0(b, l + 1);
    if (!r) r = CopatternAtom(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ID CopatternAtom
  private static boolean Copattern1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Copattern1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && CopatternAtom(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '#'
  //                 | '[' Copattern ']'
  public static boolean CopatternAtom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CopatternAtom")) return false;
    if (!nextTokenIs(b, "<copattern atom>", HASH, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COPATTERN_ATOM, "<copattern atom>");
    r = consumeToken(b, HASH);
    if (!r) r = CopatternAtom_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' Copattern ']'
  private static boolean CopatternAtom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CopatternAtom_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && Copattern(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PatternAtom CopatternP?
  public static boolean CopatternP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CopatternP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COPATTERN_P, "<copattern p>");
    r = PatternAtom(b, l + 1);
    r = r && CopatternP_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CopatternP?
  private static boolean CopatternP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CopatternP_1")) return false;
    CopatternP(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'data' ID IDs? '{' Injs? '}'
  //        | 'codata' ID IDs? '{' Projs? '}'
  //        | 'index' ID IDs?
  public static boolean Decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL, "<decl>");
    r = Decl_0(b, l + 1);
    if (!r) r = Decl_1(b, l + 1);
    if (!r) r = Decl_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'data' ID IDs? '{' Injs? '}'
  private static boolean Decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATA, ID);
    r = r && Decl_0_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && Decl_0_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDs?
  private static boolean Decl_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0_2")) return false;
    IDs(b, l + 1);
    return true;
  }

  // Injs?
  private static boolean Decl_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0_4")) return false;
    Injs(b, l + 1);
    return true;
  }

  // 'codata' ID IDs? '{' Projs? '}'
  private static boolean Decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CODATA, ID);
    r = r && Decl_1_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && Decl_1_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDs?
  private static boolean Decl_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_1_2")) return false;
    IDs(b, l + 1);
    return true;
  }

  // Projs?
  private static boolean Decl_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_1_4")) return false;
    Projs(b, l + 1);
    return true;
  }

  // 'index' ID IDs?
  private static boolean Decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INDEX, ID);
    r = r && Decl_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDs?
  private static boolean Decl_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_2_2")) return false;
    IDs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Decl Decls?
  public static boolean Decls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decls")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLS, "<decls>");
    r = Decl(b, l + 1);
    r = r && Decls_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decls?
  private static boolean Decls_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decls_1")) return false;
    Decls(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID IDs?
  public static boolean IDs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IDs")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && IDs_1(b, l + 1);
    exit_section_(b, m, I_DS, r);
    return r;
  }

  // IDs?
  private static boolean IDs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IDs_1")) return false;
    IDs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID ':' Constraints '=>' Type
  //       | ID ':' Type
  public static boolean Inj(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Inj")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Inj_0(b, l + 1);
    if (!r) r = Inj_1(b, l + 1);
    exit_section_(b, m, INJ, r);
    return r;
  }

  // ID ':' Constraints '=>' Type
  private static boolean Inj_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Inj_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON);
    r = r && Constraints(b, l + 1);
    r = r && consumeToken(b, DARR);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID ':' Type
  private static boolean Inj_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Inj_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Inj '|' Injs
  //        | Inj
  public static boolean Injs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Injs")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Injs_0(b, l + 1);
    if (!r) r = Inj(b, l + 1);
    exit_section_(b, m, INJS, r);
    return r;
  }

  // Inj '|' Injs
  private static boolean Injs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Injs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Inj(b, l + 1);
    r = r && consumeToken(b, MID);
    r = r && Injs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ObsCtx1 ObsCtxP?
  public static boolean ObsCtx(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtx")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBS_CTX, "<obs ctx>");
    r = ObsCtx1(b, l + 1);
    r = r && ObsCtx_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ObsCtxP?
  private static boolean ObsCtx_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtx_1")) return false;
    ObsCtxP(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID ObsCtxAtom
  //           | ObsCtxAtom
  public static boolean ObsCtx1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtx1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBS_CTX_1, "<obs ctx 1>");
    r = ObsCtx1_0(b, l + 1);
    if (!r) r = ObsCtxAtom(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ID ObsCtxAtom
  private static boolean ObsCtx1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtx1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && ObsCtxAtom(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '#'
  //              | '[' ObsCtx ']'
  public static boolean ObsCtxAtom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtxAtom")) return false;
    if (!nextTokenIs(b, "<obs ctx atom>", HASH, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBS_CTX_ATOM, "<obs ctx atom>");
    r = consumeToken(b, HASH);
    if (!r) r = ObsCtxAtom_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' ObsCtx ']'
  private static boolean ObsCtxAtom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtxAtom_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && ObsCtx(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // term_atom_group ObsCtxP?
  public static boolean ObsCtxP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtxP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBS_CTX_P, "<obs ctx p>");
    r = term(b, l + 1, 6);
    r = r && ObsCtxP_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ObsCtxP?
  private static boolean ObsCtxP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObsCtxP_1")) return false;
    ObsCtxP(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID PatternAtom *
  //           | ID
  public static boolean Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pattern_0(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, PATTERN, r);
    return r;
  }

  // ID PatternAtom *
  private static boolean Pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && Pattern_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PatternAtom *
  private static boolean Pattern_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PatternAtom(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Pattern_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '_'
  //               | ID
  //               | '(' Pattern ')'
  public static boolean PatternAtom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternAtom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_ATOM, "<pattern atom>");
    r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, ID);
    if (!r) r = PatternAtom_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' Pattern ')'
  private static boolean PatternAtom_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternAtom_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Pattern(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Decls? Term
  static boolean Program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Program_0(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Decls?
  private static boolean Program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program_0")) return false;
    Decls(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID ':' Constraints '=>' Type
  //        | ID ':' Type
  public static boolean Proj(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Proj")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Proj_0(b, l + 1);
    if (!r) r = Proj_1(b, l + 1);
    exit_section_(b, m, PROJ, r);
    return r;
  }

  // ID ':' Constraints '=>' Type
  private static boolean Proj_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Proj_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON);
    r = r && Constraints(b, l + 1);
    r = r && consumeToken(b, DARR);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID ':' Type
  private static boolean Proj_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Proj_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Proj ',' Projs
  //         | Proj
  public static boolean Projs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Projs")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Projs_0(b, l + 1);
    if (!r) r = Proj(b, l + 1);
    exit_section_(b, m, PROJS, r);
    return r;
  }

  // Proj ',' Projs
  private static boolean Projs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Projs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Proj(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Projs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // term
  public static boolean Term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = term(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = type(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: term
  // Operator priority table:
  // 0: BINARY(add_term)
  // 1: POSTFIX(ann_term)
  // 2: PREFIX(fix_term) ATOM(let_term)
  // 3: PREFIX(case_term)
  // 4: PREFIX(prompt_term)
  // 5: POSTFIX(app_term)
  // 6: PREFIX(cocase_term)
  // 7: ATOM(num_term) ATOM(var_term) PREFIX(paren_term) ATOM(coalts_term)
  public static boolean term(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "term")) return false;
    addVariant(b, "<term>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<term>");
    r = fix_term(b, l + 1);
    if (!r) r = let_term(b, l + 1);
    if (!r) r = case_term(b, l + 1);
    if (!r) r = prompt_term(b, l + 1);
    if (!r) r = var_term(b, l + 1);
    if (!r) r = cocase_term(b, l + 1);
    if (!r) r = num_term(b, l + 1);
    if (!r) r = paren_term(b, l + 1);
    if (!r) r = coalts_term(b, l + 1);
    p = r;
    r = r && term_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean term_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "term_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, PLUS)) {
        r = term(b, l, 0);
        exit_section_(b, l, m, ADD_TERM, r, true, null);
      }
      else if (g < 1 && ann_term_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ANN_TERM, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, ID)) {
        r = true;
        exit_section_(b, l, m, APP_TERM, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // ':' type_atom_group
  private static boolean ann_term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ann_term_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COLON);
    r = r && type(b, l + 1, 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean fix_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fix_term")) return false;
    if (!nextTokenIsSmart(b, FIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = parseTokensSmart(b, 0, FIX, ID, IN);
    p = r;
    r = p && term(b, l, 2);
    exit_section_(b, l, m, FIX_TERM, r, p, null);
    return r || p;
  }

  // 'let' ID '=' term 'in' term
  public static boolean let_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_term")) return false;
    if (!nextTokenIsSmart(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, LET, ID, EQ);
    r = r && term(b, l + 1, -1);
    r = r && consumeToken(b, IN);
    r = r && term(b, l + 1, -1);
    exit_section_(b, m, LET_TERM, r);
    return r;
  }

  public static boolean case_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_term")) return false;
    if (!nextTokenIsSmart(b, CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, CASE);
    p = r;
    r = p && term(b, l, 6);
    r = p && report_error_(b, case_term_1(b, l + 1)) && r;
    exit_section_(b, l, m, CASE_TERM, r, p, null);
    return r || p;
  }

  // '{' Alts? '}'
  private static boolean case_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && case_term_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Alts?
  private static boolean case_term_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_term_1_1")) return false;
    Alts(b, l + 1);
    return true;
  }

  public static boolean prompt_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prompt_term")) return false;
    if (!nextTokenIsSmart(b, HASH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, HASH);
    p = r;
    r = p && term(b, l, 4);
    exit_section_(b, l, m, PROMPT_TERM, r, p, null);
    return r || p;
  }

  // ID
  public static boolean var_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_term")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ID);
    exit_section_(b, m, VAR_TERM, r);
    return r;
  }

  public static boolean cocase_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cocase_term")) return false;
    if (!nextTokenIsSmart(b, COCASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = cocase_term_0(b, l + 1);
    p = r;
    r = p && term(b, l, 6);
    exit_section_(b, l, m, COCASE_TERM, r, p, null);
    return r || p;
  }

  // 'cocase' ObsCtxAtom
  private static boolean cocase_term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cocase_term_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COCASE);
    r = r && ObsCtxAtom(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER
  public static boolean num_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_term")) return false;
    if (!nextTokenIsSmart(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NUMBER);
    exit_section_(b, m, NUM_TERM, r);
    return r;
  }

  public static boolean paren_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_term")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && term(b, l, -1);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PAREN_TERM, r, p, null);
    return r || p;
  }

  // '{' Coalts? '}'
  public static boolean coalts_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coalts_term")) return false;
    if (!nextTokenIsSmart(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACE);
    r = r && coalts_term_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, COALTS_TERM, r);
    return r;
  }

  // Coalts?
  private static boolean coalts_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coalts_term_1")) return false;
    Coalts(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression root: type
  // Operator priority table:
  // 0: BINARY(arr_type)
  // 1: POSTFIX(app_type)
  // 2: ATOM(var_type) ATOM(lit_type) PREFIX(paren_type)
  public static boolean type(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "type")) return false;
    addVariant(b, "<type>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = var_type(b, l + 1);
    if (!r) r = lit_type(b, l + 1);
    if (!r) r = paren_type(b, l + 1);
    p = r;
    r = r && type_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean type_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, ARR)) {
        r = type(b, l, -1);
        exit_section_(b, l, m, ARR_TYPE, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, ID)) {
        r = true;
        exit_section_(b, l, m, APP_TYPE, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // ID
  public static boolean var_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_type")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ID);
    exit_section_(b, m, VAR_TYPE, r);
    return r;
  }

  // 'Int'
  public static boolean lit_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lit_type")) return false;
    if (!nextTokenIsSmart(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INT);
    exit_section_(b, m, LIT_TYPE, r);
    return r;
  }

  public static boolean paren_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_type")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && type(b, l, -1);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PAREN_TYPE, r, p, null);
    return r || p;
  }

}
