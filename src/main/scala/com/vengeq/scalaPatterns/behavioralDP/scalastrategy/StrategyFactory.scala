package com.vengeq.scalaPatterns.behavioralDP.scalastrategy

import java.io.InputStreamReader

import com.github.tototoshi.csv.CSVReader
import com.vengeq.scalaPatterns.behavioralDP.strategy.Person
import org.json4s.{DefaultFormats, StreamInput}
import org.json4s.jackson.JsonMethods

object StrategyFactory {
  implicit val formats = DefaultFormats
  def apply(filename: String): (String) => List[Person] =
    filename match {
      case f if f.endsWith(".json") => parseJson
      case f if f.endsWith(".csv") => parseCsv
      case f => throw new RuntimeException(s"Unknown format: $f")
    }
  def parseJson(file: String): List[Person] = JsonMethods.parse(StreamInput(this.getClass.getResourceAsStream(file))).extract[List[Person]]
  def parseCsv(file: String): List[Person] = CSVReader.open(new InputStreamReader(this.getClass.getResourceAsStream(file))).all().map {
    case List(name, age, address) => Person(name, age.toInt, address)
  }
}