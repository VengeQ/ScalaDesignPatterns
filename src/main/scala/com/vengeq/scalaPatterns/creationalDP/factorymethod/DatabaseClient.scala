package com.vengeq.scalaPatterns.creationalDP.factorymethod

import com.vengeq.scalaPatterns.creationalDP.{SimpleConnection, SimpleMysqlConnection, SimpleOraSqlConnection, SimplePgSqlConnection}


abstract class DatabaseClient {
  def executeQuery(query: String): Unit = {
    val connection = connect()
    notification()
    connection.executeQuery(query)
  }
  def getTrace:Unit={
    val connection=connect()
    connection.getTrace()
  }
  protected def connect(): SimpleConnection
  protected def notification():Unit
}

class MysqlClient extends DatabaseClient {
  override protected def connect(): SimpleConnection = new SimpleMysqlConnection

  override protected def notification(): Unit = println("Sql notification")
}

class PgSqlClient extends DatabaseClient {
  override protected def connect(): SimpleConnection = new SimplePgSqlConnection

  override protected def notification(): Unit = println("Pg notification")
}

class OraSqlClient extends DatabaseClient {
  override protected def connect(): SimpleConnection = new SimpleOraSqlConnection

  override protected def notification(): Unit = println("Ora notification")
}



