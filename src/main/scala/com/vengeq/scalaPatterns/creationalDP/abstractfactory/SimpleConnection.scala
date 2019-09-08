package com.vengeq.scalaPatterns.creationalDP.abstractfactory

trait SimpleConnection {
  def getName(): String
  def executeQuery(query: String): Unit
  def getTrace():String
}
class SimpleMysqlConnection extends SimpleConnection {
  override def getName(): String = "SimpleMysqlConnection"
  override def executeQuery(query: String): Unit = System.out.println(s"Executing the query '$query' the MySQL way.")

  override def getTrace(): String = ("Trace from MySql instance")
}
class SimplePgSqlConnection extends SimpleConnection {
  override def getName(): String = "SimplePgSqlConnection"
  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the PgSQL way.")
  }
  override def getTrace(): String = ("Trace from PgSql instance")
}

class SimpleOraSqlConnection extends SimpleConnection {
  override def getName(): String = "SimpleOraSqlConnection"
  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the OraSQL way.")
  }
  override def getTrace(): String = ("Trace from OraSql instance")
}

class SimpleYetAnotherSqlConnection extends SimpleConnection {
  override def getName(): String = "SimpleYetAnotherSqlConnection"
  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the YetAnotherSQL way.")
  }
  override def getTrace(): String = ("Trace from YetAnotherSql instance")
}