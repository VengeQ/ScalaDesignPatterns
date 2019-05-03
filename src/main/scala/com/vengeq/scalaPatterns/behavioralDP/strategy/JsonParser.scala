package com.vengeq.scalaPatterns.behavioralDP.strategy

import org.json4s._
import org.json4s.jackson.JsonMethods
class JsonParser extends Parser[Person] {
  implicit val formats = DefaultFormats
  override def parse(file: String): List[Person] =
    JsonMethods.parse(StreamInput(this.getClass.getResourceAsStream(file))).extract[List[Person]]
}