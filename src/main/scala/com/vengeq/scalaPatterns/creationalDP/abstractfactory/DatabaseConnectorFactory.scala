package com.vengeq.scalaPatterns.creationalDP.abstractfactory

import com.vengeq.scalaPatterns.creationalDP.{SimpleConnection, SimpleMysqlConnection, SimpleOraSqlConnection, SimplePgSqlConnection}

trait DatabaseConnectorFactory {
  def connect(): SimpleConnection

}
class MySqlFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimpleMysqlConnection
}
class PgSqlFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimplePgSqlConnection
}

class OraSqlFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimpleOraSqlConnection
}