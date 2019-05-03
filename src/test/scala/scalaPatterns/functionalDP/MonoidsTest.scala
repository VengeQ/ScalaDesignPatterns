package com.vengeq.scalaPatterns.functionalDP

import org.scalatest.FunSuite
import com.vengeq.scalaPatterns.functionalDP.monoids._
import com.vengeq.scalaPatterns.functionalDP.monoids.MonoidOperation

import scala.annotation.tailrec


class MonoidsTest extends FunSuite{


  test("reduceTest"){
    val list =(1 to 1000) toList
    val result = MonoidOperation.parallelFold(list)
    while(!result.isCompleted){}
    println(result)

  }
}
