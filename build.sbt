name := "calcite-arrow-sample"

version := "1.0"

scalaVersion := "2.13.3"

libraryDependencies += "org.apache.hive" % "hive-exec" % "1.2.1"
libraryDependencies += "org.pentaho" % "pentaho-aggdesigner-algorithm" % "5.1.5-jhyde" % Test

resolvers += Resolver.mavenLocal
resolvers += "Cascading repo" at "http://conjars.org/repo"

libraryDependencies += "org.apache.calcite" % "calcite-core" % "1.6.0"
libraryDependencies += "org.apache.calcite" % "calcite-linq4j" % "1.25.0"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.11.2"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.11.2"
libraryDependencies += "junit" % "junit" % "4.13"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.11"
libraryDependencies += "commons-io" % "commons-io" % "2.8.0"
libraryDependencies += "sqlline" % "sqlline" % "1.9.0"
libraryDependencies += "commons-beanutils" % "commons-beanutils" % "1.9.4"
libraryDependencies += "org.apache.arrow" % "arrow-vector" % "1.0.1"
libraryDependencies += "ch.qos.logback" % "logback-core" % "1.2.3"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
