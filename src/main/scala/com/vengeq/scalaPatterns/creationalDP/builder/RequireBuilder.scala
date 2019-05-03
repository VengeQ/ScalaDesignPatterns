package com.vengeq.scalaPatterns.creationalDP.builder

case class PersonRequire(
  firstName: String = "",
  lastName: String = "",
  age: Int = 0
) {
  require(firstName != "", "First name is required.")
  require(lastName != "", "Last name is required.")
}