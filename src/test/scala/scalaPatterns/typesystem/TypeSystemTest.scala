package com.vengeq.scalaPatterns.typesystem


import java.net.URL

import org.scalatest.FunSuite

import scala.util.Random

class TypeSystemTest extends FunSuite{

  test("TypeSystemTest"){

    case class Person(val name:String)

    class Pair[+T]( first: T,  second: T)

    def makeFriends(p:Pair[Person])=println("We are friend now!!!")

  }
}
