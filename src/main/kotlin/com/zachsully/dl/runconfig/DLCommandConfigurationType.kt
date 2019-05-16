package com.zachsully.dl.runconfig

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.zachsully.dl.DLIcons;
import javax.swing.Icon

class DLCommandConfigurationType : ConfigurationType {
    override fun getDisplayName(): String = "DL"
    override fun getIcon(): Icon = DLIcons.FILE_ICON
    override fun getConfigurationTypeDescription(): String = "DL Command Configuration"
    override fun getId(): String = "DL_COMMAND_CONFIGURATION"
    override fun getConfigurationFactories(): Array<ConfigurationFactory>
      = arrayOf(DLCommandConfigurationFactory())
}