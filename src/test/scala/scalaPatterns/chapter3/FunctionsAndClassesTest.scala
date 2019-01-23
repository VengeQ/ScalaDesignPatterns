package scalaPatterns.chapter3

import com.vengeq.scalaPatterns.chapter3.FunctionObjects
import org.scalatest.FunSuite

class FunctionsAndClassesTest extends FunSuite{

  test("Functions without sugar!"){
    val o =new FunctionObjects
    println(s"${o.sum(1,2)}")
    println(s"${o.runOperation(o.sum,1.0,2.0)}")
  }

}

