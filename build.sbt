import com.typesafe.sbt.SbtGit

name := "emoji"

organization := "com.lightbend"

version := "1.1.1"

lazy val scala211Version = "2.11.11"
lazy val scala212Version = "2.12.3"

scalaVersion := scala212Version

crossScalaVersions := Seq(scala212Version, scala211Version)

bintrayOrganization := Some("typesafe")
bintrayRepository := "ivy-releases"
bintrayPackage := "emoji"
bintrayReleaseOnPublish := false

publishMavenStyle := false

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings")

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % Test
)

initialCommands in console := {
  """import com.lightbend.emoji._
    |import com.lightbend.emoji.Emoji.Implicits._
    |import com.lightbend.emoji.ShortCodes.Implicits._
    |""".stripMargin
}

scalariformSettings
