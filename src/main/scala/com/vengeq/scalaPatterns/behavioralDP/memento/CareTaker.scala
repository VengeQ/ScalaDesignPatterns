package com.vengeq.scalaPatterns.behavioralDP.memento

trait Caretaker[T] {
  var states:List[Memento[T]]=List()
}