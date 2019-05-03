package com.vengeq.scalaPatterns.behavioralDP.command

trait RobotCommand {
  def execute(): Unit
}
case class MakeSandwichCommand(robot: Robot) extends RobotCommand {
  override def execute(): Unit = robot.makeSandwich()
}
case class PourJuiceCommand(robot: Robot) extends RobotCommand {
  override def execute(): Unit = robot.pourJuice()
}
case class CleanUpCommand(robot: Robot) extends RobotCommand {
  override def execute(): Unit = robot.cleanUp()
}
