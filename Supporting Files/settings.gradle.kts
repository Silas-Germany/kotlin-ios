pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

enableFeaturePreview("GRADLE_METADATA")

include(":application")
project(":application").projectDir = file("../application")
rootProject.name = file("..").name
