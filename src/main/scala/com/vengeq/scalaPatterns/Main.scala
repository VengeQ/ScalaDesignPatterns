package com.vengeq.scalaPatterns

import com.vengeq.scalaPatterns.chapter2.traits.NotifierImpl
import com.vengeq.scalaPatterns.chapter4._
import com.vengeq.scalaPatterns.chapter5._
import com.vengeq.scalaPatterns.creationalDP.lazyinitialization.CircleUtils

object Main extends App {

  System.out.println(s"The basic area for a circle with radius 2.5 is ${CircleUtils.area (2.5)}")
  System.out.println(s"The precise area for a circle with radius 2.5 is ${CircleUtils.area (2.5, true)}")
  System.out.println(s"The basic area for a circle with radius 6.78 is ${CircleUtils.area (6.78)}")
  System.out.println(s"The precise area for a circle with radius 6.78 is ${CircleUtils.area (6.78, true)}")
}
