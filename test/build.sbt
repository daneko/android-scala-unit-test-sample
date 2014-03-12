
name := "test"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.10" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)
