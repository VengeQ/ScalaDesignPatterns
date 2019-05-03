package com.vengeq.scalaPatterns.creationalDP.builder

case class PersonCase(
  firstName: String = " ",
  secondName:String =" ",
  age:Int =0
)

case class PersonNone(
  firstName:Option[String] = None,
  lastName:Option[String] = None,
  age: Option[Int] = None
)