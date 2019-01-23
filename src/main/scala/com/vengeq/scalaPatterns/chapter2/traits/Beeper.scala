package com.vengeq.scalaPatterns.chapter2.traits

trait Beeper {
  def beep(times: Int): Unit = 1 to times foreach(i => System.out.println(s"Beep number: $i"))
}
