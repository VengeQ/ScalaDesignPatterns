package com.vengeq.scalaPatterns.structuralDP.decorator
import scala.collection.JavaConverters.asScalaIteratorConverter
import java.io.BufferedReader

class AdvancedInputReader(reader: BufferedReader) extends InputReader {
  override def readLines(): Stream[String] = reader.lines().iterator().asScala.toStream
}