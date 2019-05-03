package com.vengeq.scalaPatterns.structuralDP
import com.vengeq.scalaPatterns.structuralDP.adapter.{AppLogger, FinalLogger, Log}
import org.scalatest.FunSuite

class AdapterTest extends FunSuite{
  test("Adapter for logger test"){
    val logger = new AppLogger
    logger.info("This is an info message.")
    logger.debug("Debug something here.")
    logger.error("Show an error message.")
    logger.warning("About to finish.")
    logger.info("Bye!")
  }

  test("Adapter implicit Test"){
    import com.vengeq.scalaPatterns.structuralDP.adapter.adapter._
    val logger:Log = new FinalLogger
    logger.info("This is an info message.")
    logger.debug("Debug something here.")
    logger.error("Show an error message.")
    logger.warning("About to finish.")
    logger.info("Bye!")
  }

  test("Implicit String test"){
    import com.vengeq.scalaPatterns.structuralDP.adapter.adapter._
    val string1="Hello"
    val string2="akka"
    println(s"Is $string1 is Palindrom? => ${string1.isPalindrom}")
    println(s"Is $string2 is Palindrom? => ${string2.isPalindrom}")
  }
}
