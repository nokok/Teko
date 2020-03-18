package org.tekolang.backend.jvm

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.net.URI

class TekoClassWriter {
  fun write(): Map<URI, ByteArray> {
    val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)
    writer.visit(
      Opcodes.V1_8,
      Opcodes.ACC_PUBLIC,
      "Foo",
      null,
      Type.getInternalName(Object::class.java),
      null
    )
    val bytecode: ByteArray = writer.toByteArray()
    val uri: URI = URI.create("")
    return mapOf(Pair(uri, bytecode))
  }
}