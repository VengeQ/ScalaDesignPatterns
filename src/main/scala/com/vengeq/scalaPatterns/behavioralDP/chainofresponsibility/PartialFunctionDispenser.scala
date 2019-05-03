package com.vengeq.scalaPatterns.behavioralDP.chainofresponsibility

trait PartialFunctionDispenser {
  def dispense(dispenserAmount: Int): PartialFunction[Money, Money] = {
    case Money(amount) if amount >= dispenserAmount =>
      val notes = amount / dispenserAmount
      val left = amount % dispenserAmount
      System.out.println(s"Dispensing $notes note/s of $dispenserAmount.")
      Money(left)
    case m @ Money(amount) => m
  }
}
