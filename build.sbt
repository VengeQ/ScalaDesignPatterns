name := "ScalaPatterns"

version := "0.1"

scalaVersion := "2.12.8"

connectInput:= true
fork := true

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.6.3"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"

libraryDependencies += "commons-codec" % "commons-codec" % "1.11"

libraryDependencies += "com.github.tototoshi" %% "scala-csv" % "1.3.5"


//mainClass  := Some("com.vengeq.scalaPatterns.Main")