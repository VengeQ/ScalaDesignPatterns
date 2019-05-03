package com.vengeq.scalaPatterns.functionalDP.monoids

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global

object MonoidOperation {
  def fold[T](list: List[T], m: Monoid[T]): T = list.foldLeft(m.zero)(m.op)

  def parallelFold(list:List[Int])={
    val splitterLists=list.splitAt(list.length/2 toInt)
    def calculate(l:List[Int]):Future[Int]={
      val p =Promise[Int]
      global.execute(() => try {
        p.success(l.reduceRight(_ + _))
      })
      p.future
    }
    val f1=calculate(splitterLists._1)
    val f2=calculate(splitterLists._2)

    for{
      r1 <- f1
      r2 <- f2
    } yield (r1+r2)
  }
}
