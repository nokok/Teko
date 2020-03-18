package org.tekolang

import org.tekolang.core.CompilationError
import org.tekolang.core.CompileResult
import org.tekolang.core.Either

class TekoCompiler {
  fun compile(): Either<CompilationError, CompileResult> {
    return Either.success(CompileResult())
  }
}
