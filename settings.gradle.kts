pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

enableFeaturePreview("GRADLE_METADATA")

include(":rev79")
project(":rev79").projectDir = file("../rev79")
rootProject.name = file("..").name
