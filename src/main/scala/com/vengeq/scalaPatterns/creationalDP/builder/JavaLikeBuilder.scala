package com.vengeq.scalaPatterns.creationalDP.builder

class Person(builder: PersonBuilder) {
  val firstName = builder.firstName
  val lastName = builder.lastName
  val age = builder.age
}

class PersonBuilder {
  var firstName = ""
  var lastName = ""
  var age = 0
  def setFirstName(firstName: String): PersonBuilder = {
    this.firstName = firstName
    this
  }
  def setLastName(lastName: String): PersonBuilder = {
    this.lastName = lastName
    this
  }
  def setAge(age: Int): PersonBuilder = {
    this.age = age
    this
  }
  def build(): Person = new Person(this)
}