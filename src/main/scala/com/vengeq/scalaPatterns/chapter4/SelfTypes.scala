package com.vengeq.scalaPatterns.chapter4

import scala.collection.mutable

trait Persister[T] {
  self: Database[T] =>
  def persist(data: T): Unit = {
    System.out.println("Calling persist.")
    save(data)
  }
}
trait Database[T] {
  def save(data: T)
}

trait MemoryDatabase[T] extends Database[T] {
  val db: mutable.MutableList[T] = mutable.MutableList.empty
  override def save(data: T): Unit = {
    System.out.println("Saving to in memory database.")
    db.+=:(data)
  }
}

trait FileDatabase[T] extends Database[T] {
  override def save(data: T): Unit = {
    System.out.println("Saving to file.")
  }
}

class FilePersister[T] extends Persister[T] with FileDatabase[T]
class MemoryPersister[T] extends Persister[T] with MemoryDatabase[T]