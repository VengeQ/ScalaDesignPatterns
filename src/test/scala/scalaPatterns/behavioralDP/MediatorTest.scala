package com.vengeq.scalaPatterns.behavioralDP

import com.vengeq.scalaPatterns.behavioralDP.mediator._
import org.scalatest.FunSuite

class MediatorTest extends FunSuite{
  test("Mediator test"){

    val g1=new GameGroup("Football")
    val g2 = new GameGroup("Cs")

    val s1=new Person("igor")
    val s2=new Person("andrey")
    val s3=new Person("ivan")
    val s4 = new Person("inna")

    val groups = new OurGroups

    groups.addPersonToGameGroup(s1,g1)
    groups.addPersonToGameGroup(s3,g1)


    groups.addPersonToGameGroup(s1,g2)

    groups.addPersonToGameGroup(s4,g2)

    groups.addPersonToGameGroup(s3,g2)
    println(groups.getGroupsForPerson(s1))
    println(groups.getPersonsInGroup(g1))

    val g3=new GameGroup("emtpy")
    groups.removePersonToGameGroup(s1,g3)

    groups.getGroupsForPerson(s1) foreach(println)

  }
}
