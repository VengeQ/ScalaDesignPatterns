package com.vengeq.scalaPatterns.behavioralDP

import com.vengeq.scalaPatterns.behavioralDP.nullobject.DataGenerator
import org.scalatest.FunSuite

import scala.util.Random

class NullObjectTest extends FunSuite{
  test("Null object test"){
    val TIMES_TO_TRY = 10
    val MAX_TIME = 5000

    val generator = new DataGenerator
    // start the generator in another thread
    new Thread(generator).start()
    val random = new Random()
    (0 to TIMES_TO_TRY).foreach {
      case time =>
        Thread.sleep(random.nextInt(MAX_TIME))
        System.out.println("Getting next message...")
        generator.getMessage().foreach(m =>
          System.out.println(m.print()))
    }
    generator.requestStop()
  }
}
