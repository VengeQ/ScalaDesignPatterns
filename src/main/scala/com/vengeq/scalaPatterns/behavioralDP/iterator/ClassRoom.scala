package com.vengeq.scalaPatterns.behavioralDP.iterator

import scala.collection.mutable.ListBuffer

class ClassRoom extends Iterable[Student] {
  val students: ListBuffer[Student] = ListBuffer[Student]()
  def add(student: Student): Unit = {
    student +=: students
  }
  override def iterator: Iterator[Student] = new
      StudentIterator(students.toArray)
}