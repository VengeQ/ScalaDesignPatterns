package com.vengeq.scalaPatterns.behavioralDP.chainofresponsibility

class ATM {
  val dispenser: Dispenser = {
    val d1 = new Dispenser5(None)
    val d2 = new Dispenser10(Some(d1))
    val d3 = new Dispenser20(Some(d2))
    new Dispenser50(Some(d3))
  }
  def requestMoney(money: Money): Unit = {
    if (money.amount % 5 != 0) {
      System.err.println("The smallest nominal is 5 and we cannot satisfy your request.")
    } else {
      dispenser.dispense(money)
    }
  }
}
