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

public class DLConstraintsImpl extends ASTWrapperPsiElement implements DLConstraints {

  public DLConstraintsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DLVisitor visitor) {
    visitor.visitConstraints(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLVisitor) accept((DLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLConstraint getConstraint() {
    return findNotNullChildByClass(DLConstraint.class);
  }

  @Override
  @Nullable
  public DLConstraints getConstraints() {
    return findChildByClass(DLConstraints.class);
  }

}
