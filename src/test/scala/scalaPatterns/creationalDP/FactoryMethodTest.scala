package scalaPatterns.creationalDP

import com.vengeq.scalaPatterns.creationalDP.factorymethod.{DatabaseClient, MysqlClient, OraSqlClient, PgSqlClient}
import org.scalatest.FunSuite

class FactoryMethodTest extends FunSuite{

  val clientMySql:DatabaseClient = new MysqlClient
  val clientPgSql:DatabaseClient = new PgSqlClient
  val clientOraSql:DatabaseClient = new OraSqlClient

  test("Test factory method"){
    clientMySql.executeQuery("Select * from users")
    clientMySql.getTrace
    clientPgSql.executeQuery("Select * from all_users")
    clientOraSql.executeQuery("Select * from products")
    clientOraSql.getTrace
  }
}