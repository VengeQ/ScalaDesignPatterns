package com.vengeq.scalaPatterns.structuralDP.decorator

import java.io.ByteArrayOutputStream
import java.nio.charset.Charset
import java.util.zip.GZIPOutputStream

import com.typesafe.scalalogging.LazyLogging
import com.vengeq.scalaPatterns.logger

class CompressingInputReader(inputReader: InputReader) extends InputReaderDecorator(inputReader) with LazyLogging {
  override def readLines(): Stream[String] = super.readLines().map {
    case line =>
      val text = line.getBytes(Charset.forName("UTF-8"))
      logger.info("Length before compression: {}", text.length.toString)
      val output = new ByteArrayOutputStream()
      val compressor = new GZIPOutputStream(output)
      try {
        compressor.write(text, 0, text.length)
        val outputByteArray = output.toByteArray
        logger.info("Length after compression: {}", outputByteArray.length.toString)
        new String(outputByteArray, Charset.forName("UTF-8"))
      } finally {
        compressor.close()
        output.close()
      }
  }
}