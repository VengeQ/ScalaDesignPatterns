package com.vengeq.scalaPatterns.behavioralDP

import java.net.SocketException

import com.vengeq.scalaPatterns.behavioralDP.chainofresponsibility.{ATM, Money}
import org.scalatest.FunSuite

import scala.io.Source

class ChainOfResponsibilityTest extends FunSuite {


  test("ATM test") {

    val atm = new ATM
    printHelp()
    Source.stdin.getLines().foreach {
      case line =>
        processLine(line, atm)
    }

    def printHelp(): Unit = {
      System.out.println("Usage: ")
      System.out.println("1. Write an amount to withdraw...")
      System.out.println("2. Write EXIT to quit the application.")
    }

    def processLine(line: String, atm: ATM): Unit = {
      line match {
        case "EXIT" =>

          try {
            System.out.println("Bye!")
            System.exit(0)
          } catch {
            case ex:SocketException => println("Connection reset!")
          }
        case l =>
          try {
            atm.requestMoney(Money(l.toInt))
            System.out.println("Thanks!")
          } catch {
            case _: Throwable =>
              System.err.println(s"Invalid input: $l.")
              printHelp()
          }
      }


    }
  }
}

