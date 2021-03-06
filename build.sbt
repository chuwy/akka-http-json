lazy val akkaHttpJson = project
  .in(file("."))
  .aggregate(akkaHttpPlayJson, akkaHttpJson4s, akkaHttpUpickle)
  .enablePlugins(GitVersioning)

lazy val akkaHttpPlayJson = project
  .in(file("akka-http-play-json"))
  .enablePlugins(AutomateHeaderPlugin)

lazy val akkaHttpJson4s = project
  .in(file("akka-http-json4s"))
  .enablePlugins(AutomateHeaderPlugin)

lazy val akkaHttpUpickle = project
  .in(file("akka-http-upickle"))
  .enablePlugins(AutomateHeaderPlugin)

name := "akka-http-json"

unmanagedSourceDirectories in Compile := Nil
unmanagedSourceDirectories in Test := Nil

publishArtifact := false
