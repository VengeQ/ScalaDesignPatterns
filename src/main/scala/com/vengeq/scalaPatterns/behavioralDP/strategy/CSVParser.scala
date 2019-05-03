package com.vengeq.scalaPatterns.behavioralDP.strategy

import java.io.InputStreamReader

import com.github.tototoshi.csv.CSVReader
class CSVParser extends Parser[Person] {
  override def parse(file: String): List[Person] =
    CSVReader.open(new InputStreamReader(this.getClass.getResourceAsStream(file))).all().map {
      case List(name, age, address) =>
        Person(name, age.toInt, address)
    }
}