name := "EnhancedSFU"
 
version := "1.0" 
      
lazy val `enhancedsfu` = (project in file(".")).enablePlugins(PlayScala)

      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.5"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

// Database
libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc"       % "4.0.0",
  "com.h2database"  %  "h2"                % "2.1.210",
  "ch.qos.logback"  %  "logback-classic"   % "1.2.10"
)