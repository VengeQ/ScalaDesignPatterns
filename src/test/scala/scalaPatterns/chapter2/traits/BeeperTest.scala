//package scalaPatterns.chapter2.traits

import com.vengeq.scalaPatterns.chapter2.traits.Beeper
import org.scalatest.FunSuite

class BeeperTest extends FunSuite{
  test("BeeperTest"){
    val COUNT=10
    val beeper=new Beeper{}
    beeper.beep(COUNT)
  }
}
