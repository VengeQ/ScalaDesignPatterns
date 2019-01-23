package scalaPatterns.chapter2.traits

import com.vengeq.scalaPatterns.chapter2.traits._
import org.scalatest.FunSuite

class LinearizationTest extends FunSuite{
  test("Linearization case"){
    class C1 extends A  with T1 with T2
    class  C2 extends B  with T1 with T2

    val a=new C1

}
}
