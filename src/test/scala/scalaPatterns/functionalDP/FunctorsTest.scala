package com.vengeq.scalaPatterns.functionalDP

import org.scalatest.FunSuite

class FunctorsTest extends FunSuite{
  test("compositionTest"){
    def foo(x:Array[T] forSome {type T <:AnyVal})=println(x.length)


    foo(Array[Int](1,2,3))
  }
}
