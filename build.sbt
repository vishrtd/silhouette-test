name := "silhouette-test"

version := "0.1"

scalaVersion := "2.12.6"

credentials += Credentials("Atlassian Releases", "https://maven.atlassian.com/public/", "default@default.com", "default")

libraryDependencies ++= Seq(
  "com.mohiva" %% "play-silhouette" % "5.0.7",
  "com.mohiva" %% "play-silhouette-password-bcrypt" % "5.0.7",
  "com.mohiva" %% "play-silhouette-crypto-jca" % "5.0.7",
  "com.mohiva" %% "play-silhouette-persistence" % "5.0.7",
  "com.mohiva" %% "play-silhouette-testkit" % "5.0.7" % "test"
)

libraryDependencies ++= Seq(
  "com.mohiva" %% "play-silhouette-cas" % "5.0.6",
  "com.mohiva" %% "play-silhouette-persistence-reactivemongo" % "5.0.6"
)

resolvers += "Atlassian Releases" at "https://maven.atlassian.com/public/"