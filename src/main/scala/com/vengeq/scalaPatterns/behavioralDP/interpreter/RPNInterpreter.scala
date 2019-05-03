package com.vengeq.scalaPatterns.behavioralDP.interpreter

class RPNInterpreter {
  def interpret(expression: Expression): Int = expression.interpret()
}