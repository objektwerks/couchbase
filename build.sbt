name := "couchbase"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.4.2-RC1"
libraryDependencies ++= {
  Seq(
    "com.couchbase.client" % "java-client" % "2.7.23", // Big changes with version 3.+!!!
    "ch.qos.logback" % "logback-classic" % "1.5.3",
    "org.scalatest" %% "scalatest" % "3.2.18" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
