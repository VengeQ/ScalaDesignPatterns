package com.vengeq.scalaPatterns.behavioralDP.mediator

import java.util.concurrent.atomic.AtomicInteger

case class Person(name:String){
  val id:Int=Person.newId
}
object Person{
  private val id=new AtomicInteger(0)
  def newId = id.incrementAndGet()

  def apply(name: String): Person = new Person(name)
}
