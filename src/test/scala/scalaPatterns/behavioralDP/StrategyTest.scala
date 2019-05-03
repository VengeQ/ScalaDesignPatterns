package com.vengeq.scalaPatterns.behavioralDP

import com.vengeq.scalaPatterns.behavioralDP.scalastrategy._
import com.vengeq.scalaPatterns.behavioralDP.strategy.{Parser, Person, PersonApplication}
import org.scalatest.FunSuite

class StrategyTest extends FunSuite{
  test("Strategy Test"){
    val csvPeople = Parser("/strategy/persons.csv")
    val jsonPeople = Parser("/strategy/persons.json")
    val applicationCsv = new PersonApplication(csvPeople)
    val applicationJson = new PersonApplication(jsonPeople)
    System.out.println("Using the csv: ")
    applicationCsv.write("/strategy/persons.csv")
    System.out.println("Using the json: ")
    applicationJson.write("/strategy/persons.json")
  }


  test("StrategyScala test"){
    val applicationCsv = new Application[Person](StrategyFactory("/strategy/persons.csv"))
    val applicationJson = new Application[Person](StrategyFactory("/strategy/persons.json"))
    System.out.println("Using the csv: ")
    applicationCsv.write("/strategy/persons.csv")
    System.out.println("Using the json: ")
    applicationJson.write("/strategy/persons.json")
  }
}
