package com.vengeq.scalaPatterns.behavioralDP.command

import scala.collection.mutable.ListBuffer

class RobotByNameController {
  val history = ListBuffer[() => Unit]()
  def issueCommand(command: => Unit): Unit = {
    command _ +=: history
    command
  }
  def showHistory(): Unit = {
    history.foreach(println)
  }
}