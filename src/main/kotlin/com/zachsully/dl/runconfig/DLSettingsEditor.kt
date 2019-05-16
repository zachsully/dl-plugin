package com.zachsully.dl.runconfig

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.ComponentWithBrowseButton
import javax.swing.JComponent
import javax.swing.JPanel

class DLSettingsEditor : SettingsEditor<DLRunConfiguration>() {
    private var panel : JPanel = JPanel()
    override fun applyEditorTo(s: DLRunConfiguration) {}
    override fun createEditor(): JComponent = panel
    override fun resetEditorFrom(s: DLRunConfiguration) {}
}