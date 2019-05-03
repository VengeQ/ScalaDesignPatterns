package com.vengeq.scalaPatterns.behavioralDP.memento

trait Memento[T] {
  protected val state: T
  def getState(): T = state
}