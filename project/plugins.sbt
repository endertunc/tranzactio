logLevel := Level.Warn

/* Quality control */
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("io.stryker-mutator" % "sbt-stryker4s" % "0.14.3")

/* Publishing */
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.4")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.1.0")
