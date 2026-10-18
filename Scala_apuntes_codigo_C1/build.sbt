scalaVersion := "3.8.4"

lazy val root = rootProject
  .settings(
    name := "Scala_apuntes",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.2.2" % Test
    ),
    testFrameworks += new TestFramework("munit.Framework")
  )
