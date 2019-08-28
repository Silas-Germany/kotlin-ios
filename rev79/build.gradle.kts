plugins {
    kotlin("multiplatform") version "1.3.41"
    kotlin("xcode-compat") version "0.2.3"
}

repositories {
    mavenCentral()
}

kotlin {
    xcode {
        setupApplication("rev79")
    }
}