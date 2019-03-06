// This is a generated file. Not intended for manual editing.
package com.zachsully.dl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.zachsully.dl.psi.DLTypes.*;
import com.zachsully.dl.psi.*;

public class DLAnnTermImpl extends DLTermImpl implements DLAnnTerm {

  public DLAnnTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DLVisitor visitor) {
    visitor.visitAnnTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLVisitor) accept((DLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLTerm getTerm() {
    return findNotNullChildByClass(DLTerm.class);
  }

  @Override
  @NotNull
  public DLType getType() {
    return findNotNullChildByClass(DLType.class);
  }

}
