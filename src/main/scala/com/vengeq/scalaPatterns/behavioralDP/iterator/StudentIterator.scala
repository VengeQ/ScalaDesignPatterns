package com.vengeq.scalaPatterns.behavioralDP.iterator

class StudentIterator(students: Array[Student]) extends Iterator[Student] {
  var currentPos = 0
  override def hasNext: Boolean = currentPos < students.size
  override def next(): Student = {
    val result = students(currentPos)
    currentPos = currentPos + 1
    result
  }
}
