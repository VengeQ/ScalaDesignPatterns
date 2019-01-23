package com.vengeq.scalaPatterns.creationalDP.abstractfactory

class DatabaseClient(connectorFactory: DatabaseConnectorFactory) {
  def executeQuery(query: String): Unit = {
    val connection = connectorFactory.connect()
    connection.executeQuery(query)
  }
  def getTrace():Unit={
    val connection=connectorFactory.connect()
    connection.getTrace()
  }
}
