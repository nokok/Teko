package org.tekolang.backend.jvm

import org.objectweb.asm.ClassReader
import java.io.ByteArrayInputStream
import kotlin.test.Test
import kotlin.test.assertEquals

class TekoClassWriterTest {
  @Test
  fun testWrite() {
    val writer = TekoClassWriter()
    val result = writer.write()
    assertEquals(1, result.entries.size)
    val bytecodes: ByteArray = result.values.first()

    val reader = ClassReader(ByteArrayInputStream(bytecodes))
    assertEquals("Foo", reader.className)
  }
}