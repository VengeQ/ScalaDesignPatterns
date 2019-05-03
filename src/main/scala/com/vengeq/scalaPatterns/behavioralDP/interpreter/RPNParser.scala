package com.vengeq.scalaPatterns.behavioralDP.interpreter

import java.util.StringTokenizer
import scala.collection.JavaConverters._

import scala.collection.mutable

class RPNParser {
  def parse(expression: String): Expression = {
    val tokenizer = new StringTokenizer(expression)
    tokenizer.asScala.foldLeft(mutable.Stack[Expression]()) {
      case (result, token) =>
        val item = Expression(token.toString, result.pop(), result.pop())
        item.foreach(result.push)
        result
    }.pop()
  }
}
