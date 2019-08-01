pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

enableFeaturePreview("GRADLE_METADATA")

include(":kotlin_framework")
project(":kotlin_framework").projectDir = file("../kotlin_framework")
rootProject.name = file("..").name
