name         := "abide-demo"
organization := "com.typesafe"
version      := "0.0.1-SNAPSHOT"
scalaVersion := "2.11.7"

scalacOptions ++= Seq("-feature", "-deprecation", "-Xfatal-warnings")

// libraryDependencies += "com.typesafe" %% "abide-core"  % "0.1.0-SNAPSHOT" % "abide"
// libraryDependencies += "com.typesafe" %% "abide-extra" % "0.1.0-SNAPSHOT" % "abide"

libraryDependencies += "com.typesafe" %% "abide-bay"   % "0.0.1-SNAPSHOT" % "abide"
