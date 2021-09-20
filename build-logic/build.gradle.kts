plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

group = "gradle"

dependencies {
    implementation("dev.icerock:mobile-multiplatform:0.12.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
    implementation("com.android.tools.build:gradle:7.0.2")
}