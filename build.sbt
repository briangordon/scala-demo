name := "scala-demo"

version := "1.0"

scalaVersion := "2.11.7"

dependencyOverrides += "org.scala-lang" % "scala-library" % scalaVersion.value
dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value
dependencyOverrides += "org.scala-lang" % "scala-reflect" % scalaVersion.value