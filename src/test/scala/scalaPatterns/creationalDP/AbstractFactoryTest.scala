package scalaPatterns.creationalDP

import com.vengeq.scalaPatterns.creationalDP.abstractfactory._
import org.scalatest.FunSuite

class AbstractFactoryTest extends FunSuite{

  val clientMySql:DatabaseClient = new DatabaseClient(new MySqlFactory)
  val clientPgSql:DatabaseClient = new DatabaseClient(new PgSqlFactory)
  val clientOraSql:DatabaseClient = new DatabaseClient(new OraSqlFactory)

  test("Abstract factory"){
    clientMySql.executeQuery("select * from users;")
    clientMySql.getTrace
    clientPgSql.executeQuery("select * from products;")
    clientOraSql.executeQuery("Select * from products")
    clientOraSql.getTrace
  }

}
