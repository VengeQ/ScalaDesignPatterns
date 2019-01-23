package com.vengeq.scalaPatterns.chapter4

trait GenericTransport[Environment <: TransportEnvironment, Driver <: TransportDriver]{
  def printEnvironment(environment: TransportEnvironment, driver: TransportDriver)
  = println(s"environment of this transport is $environment with driver who need to be $driver")
}

class GenericAircraft[Sky <: TransportEnvironment, Pilot <: TransportDriver] extends GenericTransport[TransportEnvironment, TransportDriver]
class GenericBoat[Water <: TransportEnvironment, Captain <: TransportDriver] extends GenericTransport[TransportEnvironment, TransportDriver]
