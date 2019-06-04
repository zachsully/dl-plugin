package com.zachsully.dl.runconfig

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager

class DLRunProfileState(mode : DLCompilerMode, env : ExecutionEnvironment) : CommandLineState(env) {
    override fun startProcess(): ProcessHandler {
        var cmdline = GeneralCommandLine()
        var project = this.environment.project
        cmdline.exePath = "dl"
        cmdline.addParameter("eval")
        cmdline.addParameter("-D")
        cmdline.addParameter(project.basePath + "/main.dl")
        return OSProcessHandler(cmdline.createProcess(),cmdline.getCommandLineString())
    }
}