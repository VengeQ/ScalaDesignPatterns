package com.vengeq.scalaPatterns.behavioralDP.memento

trait Originator[T] {
  def createMemento: Memento[T]
  def restore(memento: Memento[T])
}