package com.vengeq.scalaPatterns.chapter4

trait Clothes{
  def description :String
}

class Shirt extends Clothes{
  override def description: String = "I am shirt"
}

class Shorts extends Clothes{
  override def description: String = "I am shorts"
}


