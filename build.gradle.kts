// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "6.0.1.5171"
}
sonar {
  properties {
    property("sonar.projectKey", "gleblom_Test")
    property("sonar.organization", "gleblom")
    property("sonar.host.url", "https://sonarcloud.io")
  }
}
