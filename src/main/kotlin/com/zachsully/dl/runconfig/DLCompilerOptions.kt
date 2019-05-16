package com.zachsully.dl.runconfig

enum class Backend {
    Haskell,Ocaml,Racket,JavaScript
}

sealed class DLCompilerMode
data class CompileMode(val debug : Boolean,
                       val inputFp : String,
                       val backend : Backend,
                       val outputFp : String) : DLCompilerMode()
data class EvalMode(val debug : Boolean,
                    val inputFp: String) : DLCompilerMode()