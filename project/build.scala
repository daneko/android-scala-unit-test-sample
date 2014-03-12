import sbt._
import sbt.Keys._

import com.typesafe.sbt.SbtScalariform._
import scalariform.formatter.preferences._

object MyProjectBuild extends Build {

  // android application project
  lazy val main = Project(id = "main", base = file(".")).settings(riform:_*)

  lazy val testPrj = Project(id = "testProject", base = file("test")).settings(riform:_*).dependsOn(main).aggregate(main)

  lazy val riform = scalariformSettings ++ Seq(
    ScalariformKeys.preferences := FormattingPreferences().setPreference(AlignSingleLineCaseStatements, true))

}
