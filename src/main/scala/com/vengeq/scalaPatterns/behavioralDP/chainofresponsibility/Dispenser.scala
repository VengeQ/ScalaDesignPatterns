package com.vengeq.scalaPatterns.behavioralDP.chainofresponsibility

trait Dispenser {
  val amount: Int
  val next: Option[Dispenser]
  def dispense(money: Money): Unit = {
    if (money.amount >= amount) {
      val notes = money.amount / amount
      val left = money.amount % amount
      System.out.println(s"Dispensing $notes note/s of $amount.")
      if (left > 0) next.map(_.dispense(Money(left)))
    } else {
      next.foreach(_.dispense(money))
    }
  }
}

class Dispenser50(val next: Option[Dispenser]) extends Dispenser {
  override val amount = 50
}
class Dispenser20(val next: Option[Dispenser]) extends Dispenser {
  override val amount: Int = 20
}
class Dispenser10(val next: Option[Dispenser]) extends Dispenser {
  override val amount: Int = 10
}
class Dispenser5(val next: Option[Dispenser]) extends Dispenser {
  override val amount: Int = 5
}