package com.vengeq.scalaPatterns.behavioralDP

import com.vengeq.scalaPatterns.behavioralDP.iterator._
import org.scalatest.FunSuite

class IteratorTest extends FunSuite{
  test("Iterator Test"){
    val classRoom = new ClassRoom
    classRoom.add(Student("Ivan", 26))
    classRoom.add(Student("Maria", 26))
    classRoom.add(Student("John", 25))
    classRoom.foreach(println)

  }
}
