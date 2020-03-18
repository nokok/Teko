package org.tekolang.core.ir

import java.time.LocalDateTime

class IR(val context: Context, val modules: List<Module>, val classes: List<Class>)

class Context(val updatedAt: LocalDateTime, val target: Target)
class Target(val version: String, val platform: String)

class Module(val name: String)
class Class(val name: String, val module: String, val packageName: String)
