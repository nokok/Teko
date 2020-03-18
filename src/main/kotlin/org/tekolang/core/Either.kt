package org.tekolang.core

sealed class Either<L, R> {
  open fun isRight(): Boolean {
    return !this.isLeft()
  }

  open fun isLeft(): Boolean {
    return !this.isRight()
  }

  abstract fun value(): R?
  abstract fun error(): L?

  companion object {
    fun <L, R> success(value: R): Either<L, R> {
      return Right(value)
    }

    fun <L, R> failure(fail: L): Either<L, R> {
      return Left(fail)
    }
  }
}

class Left<L, R>(private val left: L) : Either<L, R>() {
  override fun isLeft(): Boolean {
    return true
  }

  override fun value(): R? {
    return null
  }

  override fun error(): L? {
    return left
  }

}

class Right<L, R>(private val value: R) : Either<L, R>() {
  override fun isRight(): Boolean {
    return true
  }

  override fun value(): R? {
    return this.value
  }

  override fun error(): L? {
    return null
  }
}

