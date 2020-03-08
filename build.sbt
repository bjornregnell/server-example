scalaVersion := "0.22.0-RC1"
//scalaVersion := dottyLatestNightlyBuild.get

scalacOptions ++= Seq("-Yindent-colons", "-unchecked", "-deprecation", "-language:implicitConversions")

name := "web-server-example"
version := "0.1.0"

libraryDependencies += "com.typesafe.akka" % "akka-http_2.13"   % "10.1.11"
libraryDependencies += "com.typesafe.akka" % "akka-stream_2.13" % "2.6.3"

fork := true
run / connectInput := true
outputStrategy := Some(StdoutOutput)

ThisBuild / useSuperShell := false