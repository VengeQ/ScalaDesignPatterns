package com.vengeq.scalaPatterns.chapter3

class FunctionsAndClasses {

}

class SumFunctions extends Function2[Double,Double,Double]{
  override def apply(v1: Double, v2: Double): Double = v1+v2
}

class FunctionObjects{
  val sum=new SumFunctions

  def runOperation(f:(Double,Double) => Double, a:Double, b:Double):Double=f(a,b)
}

