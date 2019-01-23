package com.vengeq.scalaPatterns.chapter4

trait DatabaseConnector{
  def connect=println(s"connected")

  def dropDatabase=println(s"database was dropped")

  def close()=println(s"Closed!")
}

trait SomeSqlDB extends DatabaseConnector{
  def select(string:String)={
    try{
      connect
      println(s"use select with $string")
    } finally close
  }
}


trait SomeSqlService {
  self:SomeSqlDB =>
}

class MyDB extends SomeSqlDB with SomeSqlService {

}