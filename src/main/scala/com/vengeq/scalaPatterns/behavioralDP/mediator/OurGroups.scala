package com.vengeq.scalaPatterns.behavioralDP.mediator
import scala.collection.mutable.Set
import scala.collection.mutable.Map
import scala.collection.mutable
class OurGroups extends MediatorForPersonAndGameGroup {

  val personsToGroup:Map[Person,mutable.Set[GameGroup]]=mutable.Map()
  val groupToPersons:Map[GameGroup,mutable.Set[Person]]=mutable.Map()

  override def addPersonToGameGroup(person: Person, gameGroup: GameGroup): Unit = {
    personsToGroup.getOrElseUpdate(person,mutable.Set())+=gameGroup
    groupToPersons.getOrElseUpdate(gameGroup,mutable.Set())+=person
  }

  override def isPersonInGroup(person: Person, gameGroup: GameGroup): Boolean = {
    groupToPersons.getOrElse(gameGroup, mutable.Set()).contains(person)
  }

  override def removePersonToGameGroup(person: Person, gameGroup: GameGroup): Unit ={
    personsToGroup.getOrElseUpdate(person,mutable.Set())-=gameGroup
    groupToPersons.getOrElseUpdate(gameGroup,mutable.Set())-=person
  }

  override def getPersonsInGroup(gameGroup: GameGroup): List[Person] =
    groupToPersons.getOrElse(gameGroup, mutable.Set()).toList:List[Person]

  override def getGroupsForPerson(person: Person): List[GameGroup] =
    personsToGroup.getOrElse(person, mutable.Set()).toList
}
