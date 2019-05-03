package com.vengeq.scalaPatterns.structuralDP.decorator

import java.nio.charset.Charset
import java.util.Base64

class Base64EncoderInputReader(inputReader: InputReader) extends InputReaderDecorator(inputReader) {
  override def readLines(): Stream[String] = super.readLines().map {
    case line => Base64.getEncoder.encodeToString(line.getBytes(Charset.forName("UTF-8")))
  }
}