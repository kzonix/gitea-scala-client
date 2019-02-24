ThisBuild / organization := "io.kzonix"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.8"

lazy val `gitea-core` = (project in file("core"))
  .settings(
    // other settings
  )

lazy val `gitea-util` = (project in file("util"))
  .settings(
    // other settings
  )

lazy val `gitea-http-client-cache-api` = (project in file("http-client-cache-api"))
  .settings(
    // other settings
  )

lazy val `gitea-http-client-cache` = (project in file("http-client-cache"))
  .settings(
    // other settings
  )


lazy val `gitea-http-client` = (project in file("http-client"))
  .settings(
    // other settings
  )
