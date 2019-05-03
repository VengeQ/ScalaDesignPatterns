package com.vengeq.scalaPatterns.creationalDP

import com.vengeq.scalaPatterns.creationalDP.builder._
import org.scalatest.FunSuite

class BuilderTest extends FunSuite{

  test("JavaLike Builder Test"){
    val person:Person = new PersonBuilder().setAge(20).setFirstName("Oleg").setLastName("Ivanov").build
    println(person.firstName+ " " + person.lastName +": " +person.age+" years!")
    assert(person.age==20)
    assert(person.firstName == "Oleg")
    assert("Ivanov" == person.lastName)

  }

  test("Case Classes Builder №1 test"){
    val p1 = PersonCase("Ivan", "Petrov",22)
    val p2 = PersonCase("Oleg")
    println(p1)
    println(p2)
  }

  test("Case classes Builder with None test"){
    val p1=PersonNone(Some("Ivan"),Some( "Ivanov"))
    println(p1.firstName.get)
    println(p1.age.getOrElse(None))
  }

  test("Case classes Builder with Require test"){
    val p1=PersonRequire("Ivan", "Ivanov")
    println(p1)
    try{
      val p2=PersonRequire("Olga")
      println(p2)
    } catch {
      case ex:IllegalArgumentException => println(ex.getLocalizedMessage)
    }


  }
}
