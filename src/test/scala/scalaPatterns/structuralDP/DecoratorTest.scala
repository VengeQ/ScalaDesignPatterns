package com.vengeq.scalaPatterns.structuralDP

import java.io.{BufferedInputStream, BufferedReader, InputStreamReader}

import com.vengeq.scalaPatterns.structuralDP.decorator.{AdvancedInputReader, Base64EncoderInputReader, CapitalizedInputReader, CompressingInputReader}
import org.scalatest.FunSuite

class DecoratorTest extends FunSuite{
  test("Decorator test"){
    val stream = new BufferedReader(
      new InputStreamReader(new BufferedInputStream(this.getClass.getResourceAsStream("/data.txt")))
    )
    try {
      val reader = new CapitalizedInputReader(new AdvancedInputReader(stream))
      reader.readLines().foreach(println)
    } finally {
      stream.close()
    }
  }

  test("Another decorator test"){
    val stream = new BufferedReader(
      new InputStreamReader(
        new
            BufferedInputStream(this.getClass.getResourceAsStream("/data.txt"))
      )
    )
    try {
      val reader = new CompressingInputReader(
        new Base64EncoderInputReader(
          new CapitalizedInputReader(
            new AdvancedInputReader(stream)
          )
        )
      )
      reader.readLines().foreach(println)
    } finally {
      stream.close()
    }
  }
}
