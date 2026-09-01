import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.ktor)
}

group = libs.versions.backend.group.get()
version = libs.versions.backend.group.get()

kotlin {
    jvmToolchain(21)

    compilerOptions {
        jvmTarget = JvmTarget.JVM_21
    }
}

dependencies {
    implementation(libs.ktor.server.netty)
    implementation(libs.ktor.server.core)
}