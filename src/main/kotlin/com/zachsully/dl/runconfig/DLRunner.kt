package com.zachsully.dl.runconfig

import com.intellij.execution.configurations.RunProfile
import com.intellij.execution.executors.DefaultRunExecutor
import com.intellij.execution.runners.DefaultProgramRunner;

class DLRunner : DefaultProgramRunner() {
    override fun getRunnerId(): String = "DLRunner"
    override fun canRun(executorId: String, profile: RunProfile): Boolean
      = DefaultRunExecutor.EXECUTOR_ID.equals(executorId) &&
            (profile is DLRunConfiguration)
}