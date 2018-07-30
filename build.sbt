lazy val cinnamonAkkaStreamsDemo = project
  .in(file("."))
  .enablePlugins(Cinnamon)
  .settings(
    scalaVersion := "2.12.6",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream" % "2.5.13",

      Cinnamon.library.cinnamonAkkaStream,
      Cinnamon.library.cinnamonPrometheusHttpServer,
      Cinnamon.library.cinnamonOpenTracingZipkin,
      Cinnamon.library.cinnamonDatadog
    ),
    cinnamon in run := true,
    connectInput in run := true
  )
