package com.vengeq.scalaPatterns.chapter2.traits

class A{
  def t =println("Inst of [A] init!")
}

class B{
  println("Inst of [B] init!")
}

trait T1{
 println("Inst of [T1] init")
}

trait T2{
  println("Inst of [T2] init")
}


class Linearization {

}

