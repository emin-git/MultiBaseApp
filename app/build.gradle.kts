plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = DefaultConfig.appNane
    compileSdk = DefaultConfig.sdk

    defaultConfig {
        applicationId = DefaultConfig.appNane
        minSdk =DefaultConfig.minsdk
        targetSdk = DefaultConfig.sdk
        versionCode = Releases.versionCode
        versionName = Releases.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = DefaultConfig.jvm
    }
    /*
    buildFeatures{
        compose = true
    }
    */
    composeOptions {
        kotlinCompilerExtensionVersion = DefaultConfig.kotlinVersion
    }
}

dependencies {
    androidX()
    retrofit()
}