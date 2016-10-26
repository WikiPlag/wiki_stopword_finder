name := "StopwordFinder"
version := "1.0"
organization := "HTW Berlin"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.7.21" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" % "scalatest_2.10" % "2.2.6" % "test",
  "org.apache.spark" %% "spark-core" % "1.3.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.3.0" % "provided"
)

excludeFilter in unmanagedResources := "*"