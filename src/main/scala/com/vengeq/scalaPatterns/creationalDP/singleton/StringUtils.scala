package com.vengeq.scalaPatterns.creationalDP.singleton

object StringUtils {
 def countNumberOfSpaces(text: String): Int = text.split("\\s+").length - 1
}
