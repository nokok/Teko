package org.tekolang.core

interface Phase {
  val name: String

  fun isRunnable(context: CompilerContext): Boolean

  fun run(context: CompilerContext)
}

interface TypeCheckedPhase : Phase {
  override fun isRunnable(context: CompilerContext): Boolean = context.isTypeChecked
}