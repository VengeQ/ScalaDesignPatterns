package com.vengeq.scalaPatterns.behavioralDP.mediator

trait MediatorForPersonAndGameGroup {
  def addPersonToGameGroup(person:Person,gameGroup: GameGroup):Unit
  def isPersonInGroup(person:Person,gameGroup: GameGroup):Boolean
  def removePersonToGameGroup(person:Person,gameGroup: GameGroup):Unit
  def getPersonsInGroup(gameGroup: GameGroup):List[Person]
  def getGroupsForPerson(person:Person):List[GameGroup]
}
