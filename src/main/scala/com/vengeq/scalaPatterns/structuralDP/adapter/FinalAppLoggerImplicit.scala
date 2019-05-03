package com.vengeq.scalaPatterns.structuralDP.adapter

import scala.annotation.tailrec

package object adapter {

  implicit class FinalAppLoggerImplicit(logger: FinalLogger) extends Log {
    override def info(message: String): Unit = logger.log(message, Info())

    override def debug(message: String): Unit = logger.log(message, Debug())

    override def warning(message: String): Unit = logger.log(message, Warning())

    override def error(message: String): Unit = logger.log(message, Error())
  }

  implicit class StringOps(string:String) {

    def isPalindrom = {
      @tailrec def go(str: String): Boolean =
        if (str.length <= 1) true
        else if (str.charAt(0) == str.last) go(str.substring(1, str.length - 1))
        else false


      go(string)
    }

  }

}