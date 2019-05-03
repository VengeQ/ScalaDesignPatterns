package com.vengeq.scalaPatterns.behavioralDP

import com.vengeq.scalaPatterns.behavioralDP.interpreter._
import org.scalatest.FunSuite

class InterpreterTest extends FunSuite{
  test("RPN test"){
    val expr1 = "1 2 + 3 * 9 10 + -" // (1 + 2) * 3 - (9 + 10) = -10
    val expr2 = "1 2 3 4 5 * * - +" // 1 + 2 - 3 * 4 * 5 = -57
    val expr3 = "12 -" // invalid
    val parser = new RPNParser
    val interpreter = new RPNInterpreter
    System.out.println(s"The result of '${expr1}' is: ${interpreter.interpret(parser.parse(expr1))}")
    System.out.println(s"The result of '${expr2}' is: ${interpreter.interpret(parser.parse(expr2))}")
    try {
      System.out.println(s"The result is: ${interpreter.interpret(parser.parse(expr3))}")
    } catch {
      case _: Throwable => System.out.println(s"'$expr3' is invalid.")
    }
  }
}
