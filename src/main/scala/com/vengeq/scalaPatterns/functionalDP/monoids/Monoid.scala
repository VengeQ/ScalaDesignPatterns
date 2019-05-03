package com.vengeq.scalaPatterns.functionalDP.monoids

trait Monoid[T] {
  def op(l:T,r:T):T
  def zero:T
}
