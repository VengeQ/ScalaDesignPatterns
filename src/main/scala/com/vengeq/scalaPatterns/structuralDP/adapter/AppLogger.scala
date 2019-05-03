package com.vengeq.scalaPatterns.structuralDP.adapter

class AppLogger extends Logger with Log{
  override def info(message: String): Unit = log(message, Info())

  override def debug(message: String): Unit =log(message, Debug())

  override def warning(message: String): Unit = log(message, Warning())

  override def error(message: String): Unit = log(message, Error())
}

