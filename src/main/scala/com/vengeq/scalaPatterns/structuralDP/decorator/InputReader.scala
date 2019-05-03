package com.vengeq.scalaPatterns.structuralDP.decorator

trait InputReader {
  def readLines(): Stream[String]
}