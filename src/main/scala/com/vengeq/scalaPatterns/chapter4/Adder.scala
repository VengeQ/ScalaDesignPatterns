package com.vengeq.scalaPatterns.chapter4

trait Adder {
  def sum[T](a: T, b: T)(implicit numeric: Numeric[T]): T =
    numeric.plus(a, b)
}