package com.zachsully.dl.runconfig

import com.intellij.execution.Executor
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.execution.configurations.RunConfigurationBase
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

class DLRunConfiguration(project : Project,
                         factory : ConfigurationFactory,
                         name : String?)
    : RunConfigurationBase<DLRunProfileState>(project,factory,name) {
    // hard code evaluate for now, but eventually we should set this in the settings editor
    private var mode : DLCompilerMode = EvalMode(false, project.projectFilePath!!)

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration>
      = DLSettingsEditor()

    override fun checkConfiguration() {}

    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState?
      = DLRunProfileState(environment)
}