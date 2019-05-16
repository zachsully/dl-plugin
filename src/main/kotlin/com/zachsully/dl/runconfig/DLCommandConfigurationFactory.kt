package com.zachsully.dl.runconfig

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class DLCommandConfigurationFactory : ConfigurationFactory(DLCommandConfigurationType()) {
    override fun createTemplateConfiguration(project: Project): RunConfiguration
      = DLRunConfiguration(project,this,"DL")
    override fun getName(): String = "DL Configuration Factory"
}