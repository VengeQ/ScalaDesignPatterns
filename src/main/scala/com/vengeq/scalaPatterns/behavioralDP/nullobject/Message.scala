package com.vengeq.scalaPatterns.behavioralDP.nullobject

case class Message(number: Int) {
  def print(): String = s"This is a message with number: $number."
}