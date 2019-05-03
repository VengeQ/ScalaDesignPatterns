package com.vengeq.scalaPatterns.structuralDP.adapter

trait Log {
  def info(message: String)
  def debug(message: String)
  def warning(message: String)
  def error(message: String)
}

