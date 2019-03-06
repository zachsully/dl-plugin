// This is a generated file. Not intended for manual editing.
package com.zachsully.dl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLPattern extends PsiElement {

  @NotNull
  List<DLPatternAtom> getPatternAtomList();

  @NotNull
  PsiElement getId();

}
