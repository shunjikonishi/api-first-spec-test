organization  := "com.example"

name          := "api-first-spec-test"

version       := "0.1"

scalaVersion  := "2.11.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  val json4sV = "3.2.11"
  Seq(
    "io.spray"            %%  "spray-can"      % sprayV,
    "io.spray"            %%  "spray-routing"  % sprayV,
    "com.typesafe.akka"   %%  "akka-actor"     % akkaV,
    "org.json4s"          %%  "json4s-native"  % json4sV,
    "org.json4s"          %%  "json4s-jackson" % json4sV,
    "io.spray"            %%  "spray-testkit"  % sprayV   % "test",
    "com.typesafe.akka"   %%  "akka-testkit"   % akkaV    % "test",
    "org.specs2"          %%  "specs2-core"    % "2.3.11" % "test"
  )
}

Revolver.settings

enablePlugins(JavaAppPackaging)