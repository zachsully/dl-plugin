package com.zachsully.dl.runconfig

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment

class DLRunProfileState(env : ExecutionEnvironment) : CommandLineState(env) {
    override fun startProcess(): ProcessHandler {
        var cmdline = GeneralCommandLine("ls")
        var project = this.environment.project
        cmdline.exePath = "dl"
        cmdline.addParameter("eval")
        cmdline.addParameter(project.projectFilePath!!)
        return OSProcessHandler(cmdline.createProcess(),cmdline.getCommandLineString())
    }
}