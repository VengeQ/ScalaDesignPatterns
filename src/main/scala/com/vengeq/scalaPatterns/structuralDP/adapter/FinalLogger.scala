package com.vengeq.scalaPatterns.structuralDP.adapter

class FinalLogger {
  def log(message: String, severity: String): Unit = {
    System.out.println(s"${severity.toUpperCase}: $message")
  }

  def log(message:String, severity: Severity):Unit={
    System.out.println(s"${severity}: $message")
  }
}