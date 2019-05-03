package com.vengeq.scalaPatterns.structuralDP.adapter

class Logger {
  def log(message: String, severity: String): Unit = {
    System.out.println(s"${severity.toUpperCase}: $message")
  }

  def log(message:String, severity: Severity):Unit={
    System.out.println(s"${severity}: $message")
  }
}

sealed trait Severity
case class Info() extends Severity {override def toString: String = "INFO"}
case class Warning() extends Severity {override def toString: String = "WARNING"}
case class Debug() extends Severity {override def toString: String = "DEBUG"}
case class Error() extends Severity {override def toString: String = "ERROR"}
