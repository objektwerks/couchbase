name := "couchbase"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.9"
libraryDependencies ++= {
  Seq(
    "com.couchbase.client" % "java-client" % "2.7.23", // Big changes with version 3.+
    "ch.qos.logback" % "logback-classic" % "1.4.1",
    "org.scalatest" %% "scalatest" % "3.2.13" % Test
  )
}
