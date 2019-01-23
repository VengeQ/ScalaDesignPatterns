package com.vengeq.scalaPatterns.chapter2.traits

trait Notifier {
  val message:String

  def printNotification=println(message)

  def clear
}


class NotifierImpl(override val message:String) extends Notifier {
  override def clear: Unit =println("CLEARED!")
}
object NotifierImpl{
  def apply(s:String)=new NotifierImpl(s)
}