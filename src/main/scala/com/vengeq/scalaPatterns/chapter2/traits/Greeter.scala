package com.vengeq.scalaPatterns.chapter2.traits

trait FormalGreeting {
  def hello(): String
}
trait InformalGreeting {
  def hello(): String
}
class Greeter extends FormalGreeting with InformalGreeting {
  override def hello(): String = "Good morning, sir/madam!"
}