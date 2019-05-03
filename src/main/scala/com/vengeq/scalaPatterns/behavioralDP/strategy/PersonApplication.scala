package com.vengeq.scalaPatterns.behavioralDP.strategy

class PersonApplication[T](parser: Parser[T]) {
  def write(file: String): Unit = System.out.println(s"Got the following data ${parser.parse(file)}")
}
