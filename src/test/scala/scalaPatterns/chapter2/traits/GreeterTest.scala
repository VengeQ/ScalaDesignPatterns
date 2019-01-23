package scalaPatterns.chapter2.traits

import com.vengeq.scalaPatterns.chapter2.traits.Greeter
import org.scalatest.FunSuite

class GreeterTest extends FunSuite{
  test("Same signatures and return types"){
    val greeter=new Greeter
    System.out.println(greeter.hello)
  }
}
