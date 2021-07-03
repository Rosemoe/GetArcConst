package io.github.Rosemoe.arcConsts
import java.io.File

fun getResource(name: String): File {
    return File(Thread.currentThread().contextClassLoader.getResource(name)!!.file)
}