package scalaPatterns.creationalDP

import com.vengeq.scalaPatterns.creationalDP.singleton.StringUtils
import org.scalatest.FunSuite

class SingletonTest extends FunSuite{
  test("Singleton Test"){
    val sentence = "Hello there! I am a utils example."
    System.out.println(s"The number of spaces in '$sentence' is: ${StringUtils.countNumberOfSpaces(sentence)}")
  }
}
