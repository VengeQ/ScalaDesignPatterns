package com.vengeq.scalaPatterns.behavioralDP

import com.vengeq.scalaPatterns.behavioralDP.command._
import org.scalatest.FunSuite

class CommandTest  extends FunSuite{
  test("Command test"){
    val robot = Robot()
    val robotController = new RobotController
    robotController.issueCommand(MakeSandwichCommand(robot))
    robotController.issueCommand(PourJuiceCommand(robot))
    System.out.println("I'm eating and having some juice.")
    robotController.issueCommand(CleanUpCommand(robot))
    System.out.println("Here is what I asked my robot to do:")
    robotController.showHistory()
  }

  test("Scala command test"){
    val robot = Robot()
    val robotController = new RobotByNameController
    robotController.issueCommand(MakeSandwichCommand(robot).execute())
    robotController.issueCommand(PourJuiceCommand(robot).execute())
    System.out.println("I'm eating and having some juice.")
    robotController.issueCommand(CleanUpCommand(robot).execute())
    System.out.println("Here is what I asked my robot to do:")
    robotController.showHistory()
  }
}
