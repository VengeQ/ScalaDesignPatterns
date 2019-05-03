package com.vengeq.scalaPatterns.structuralDP.decorator

abstract class InputReaderDecorator(inputReader: InputReader) extends InputReader {
  override def readLines(): Stream[String] = inputReader.readLines()
}