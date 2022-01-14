name := "couchbase"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.8"
libraryDependencies ++= {
  Seq(
    "com.couchbase.client" % "java-client" % "2.7.22", // Big changes with version 3.+
    "ch.qos.logback" % "logback-classic" % "1.2.10",
    "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
}
