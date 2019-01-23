package com.vengeq.scalaPatterns.creationalDP.lazyinitialization

import java.util.Properties
import com.vengeq.scalaPatterns.logger

object CircleUtils {
  val basicPi = 3.14
  lazy val precisePi: Option[Double] = {
    System.out.println("Reading properties for the precise PI.")
    val props = new Properties()
    props.load(getClass.getResourceAsStream("/pi.properties"))

    props.getProperty("pi.high") match {
      case null =>
        logger.logger.error("Properties for precise pi not found. Use value 3.14")
        Some(3.14)
      case x =>
        logger.logger.info(s"Properties was found. Pi = $x")
        Some(x.toDouble)
    }

  }



  def area(radius: Double, isPrecise: Boolean = false): Double = {
    val pi: Double = if (isPrecise) precisePi.get else basicPi
    pi * Math.pow(radius, 2)
  }
}