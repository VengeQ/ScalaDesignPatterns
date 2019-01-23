package com.vengeq.scalaPatterns.chapter5

case class Person(firstName: String, lastName: String, age: Int)

import org.json4s._
import org.json4s.jackson.JsonMethods._


class DataReaderImplWithouAOP extends DataReader {
  implicit val formats = DefaultFormats
  private def readUntimed(): List[Person] = parse(StreamInput(getClass.getResourceAsStream("/users.json"))).extract[List[Person]]
  override def readData(): List[Person] = {
    val startMillis = System.currentTimeMillis()
    val result = readUntimed()
    val time = System.currentTimeMillis() - startMillis
    System.err.println(s"readData took ${time} milliseconds.")
    result
  }
  override def readDataInefficiently(): List[Person] = {
    val startMillis = System.currentTimeMillis()
    (1 to 10000).foreach {
      case num =>
        readUntimed()
    }
    val result = readUntimed()
    val time = System.currentTimeMillis() - startMillis
    System.err.println(s"readDataInefficiently took ${time} milliseconds.")
    result
  }
}