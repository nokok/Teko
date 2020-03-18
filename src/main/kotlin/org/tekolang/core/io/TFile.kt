package org.tekolang.core.io

import java.nio.file.Files
import java.nio.file.Path

interface TFile {
  fun isVirtual(): Boolean
  fun lines(): List<String>

  companion object {
    fun load(path: Path): TFile {
      return TekoFile(path)
    }

    fun create(content: String): TFile {
      return VirtualFile(content)
    }
  }
}

class TekoFile(path: Path) : TFile {
  private val lines: List<String>

  init {
    if (!Files.isRegularFile(path)) {
      throw IllegalArgumentException("$path is not regular file")
    }
    val lines = Files.readAllLines(path)
    this.lines = lines
  }

  override fun isVirtual(): Boolean {
    return false
  }

  override fun lines(): List<String> {
    TODO("Not yet implemented")
  }
}

class VirtualFile(private val content: String) : TFile {
  override fun isVirtual(): Boolean {
    return true
  }

  override fun lines(): List<String> {
    return content.split("\n")
  }
}