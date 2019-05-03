package com.vengeq.scalaPatterns.structuralDP.decorator

class CapitalizedInputReader(inputReader: InputReader) extends InputReaderDecorator(inputReader) {
  override def readLines(): Stream[String] = super.readLines().map(_.toUpperCase)
}