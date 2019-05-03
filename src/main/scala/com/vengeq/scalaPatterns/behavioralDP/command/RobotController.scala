package com.vengeq.scalaPatterns.behavioralDP.command

import scala.collection.mutable.ListBuffer

class RobotController {
  val history = ListBuffer[RobotCommand]()
  def issueCommand(command: RobotCommand): Unit = {
    command +=: history
    command.execute()
  }
  def showHistory(): Unit = {
    history.foreach(println)
  }
}