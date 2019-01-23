package com.vengeq.scalaPatterns.chapter5


import org.json4s._
import org.json4s.jackson.JsonMethods._

trait DataReader {
  def readData(): List[Person]
  def readDataInefficiently(): List[Person]
}

class DataReaderImpl extends DataReader {

  implicit val formats = DefaultFormats

  private def readUntimed(): List[Person] = parse(StreamInput(getClass.getResourceAsStream("/users.json"))).extract[List[Person]]

  override def readData(): List[Person] = readUntimed()

  override def readDataInefficiently(): List[Person] = {
    (1 to 1000).foreach {
      case num =>
        readUntimed()
    }
    readUntimed()
  }
}
