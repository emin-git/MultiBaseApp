plugins {
    id("com.android.application") version Versions.GradlePlugin.ANDROID apply false
    id("com.android.library") version Versions.GradlePlugin.ANDROID apply false
    kotlin("android") version "1.8.0" apply false
    kotlin("jvm") version Versions.GradlePlugin.KOTLIN apply false
    id("com.google.dagger.hilt.android") version Versions.GradlePlugin.HILT apply false
}

buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven("https://www.jitpack.io")
    }

}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven("https://www.jitpack.io")
    }
}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}