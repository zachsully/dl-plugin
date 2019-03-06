// This is a generated file. Not intended for manual editing.
package com.zachsully.dl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.zachsully.dl.psi.DLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.zachsully.dl.psi.*;

public class DLCopattern1Impl extends ASTWrapperPsiElement implements DLCopattern1 {

  public DLCopattern1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DLVisitor visitor) {
    visitor.visitCopattern1(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLVisitor) accept((DLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLCopatternAtom getCopatternAtom() {
    return findNotNullChildByClass(DLCopatternAtom.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
