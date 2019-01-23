package com.vengeq.scalaPatterns.chapter4

abstract class TransportEnvironment
abstract class TransportDriver

case class Pilot() extends TransportDriver
case class Captain() extends TransportDriver

case class Water() extends TransportEnvironment
case class Sky() extends TransportEnvironment


trait Transport{
  type environment <: TransportEnvironment
  type driver <: TransportDriver
  def printEnvironment(environment: TransportEnvironment, driver: TransportDriver)
    = println(s"environment of this transport is $environment with driver who need to be $driver")
}

class Aircraft extends Transport{
  override type driver = Pilot
  override type environment = Sky
}

class Boat extends Transport{
  override type driver = Captain
  override type environment = Water
}








