package com.vengeq.scalaPatterns.behavioralDP.scalastrategy

class Application[T](strategy: (String) => List[T]) {
  def write(file: String): Unit = {
    System.out.println(s"Got the following data ${strategy(file)}")
  }
}