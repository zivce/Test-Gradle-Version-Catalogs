enableFeaturePreview("VERSION_CATALOGS")

pluginManagement {
    plugins {
        kotlin("jvm") version "1.5.30"
        id("io.gitlab.arturbosch.detekt") version "1.18.1"
        id("org.jetbrains.dokka") version "1.5.0"
        id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
        id("org.danilopianini.git-sensitive-semantic-versioning") version "0.3.0"
        id("org.danilopianini.publish-on-central") version "3.4.0"
    }
}

rootProject.name = "Test-Gradle-Version-Catalogs"
