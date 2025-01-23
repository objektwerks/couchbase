name := "couchbase"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.4-RC1"
libraryDependencies ++= {
  Seq(
    "com.couchbase.client" % "java-client" % "2.7.23", // Big changes with version 3.+!!!
    "ch.qos.logback" % "logback-classic" % "1.5.15",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
