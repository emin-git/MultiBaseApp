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
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    
    //Hilt
    implementation(libs.hilt)
    implementation(libs.hilt.navigation.compose)
    kapt(libs.hilt.compiler)

    //Server
    implementation(libs.retrofit)
    implementation(libs.gson)
    implementation(libs.converter.gson)

    //Image
    implementation(libs.glide)

    //Binding
    implementation(libs.data.binding)
    implementation(libs.view.binding)

    //Compose
    implementation(libs.compose.ui)
    implementation(libs.compose.graphics)
    implementation(libs.compose.tooling)
    implementation(libs.compose.tooling.preview)
    implementation(libs.compose.material)
    implementation(libs.compose.runtime)
    implementation(libs.compose.runtime.livedata)
    implementation(libs.compose.foundation)
    implementation(libs.compose.icon)
    implementation(libs.compose.icon.core)
    implementation(libs.compose.activity)
    implementation(libs.compose.viewmodel)
    implementation(libs.compose.paging)
    implementation(libs.compose.coil)

    //Lifecycle
    implementation(libs.lifecycle.vm)
    implementation(libs.lifecycle.livedata)

    //Navigation
    implementation(libs.navigation)
    implementation(libs.navigation.ui)

    //Ui
    implementation(libs.recycler.view)
    implementation(libs.card.view)

    //Koin
    implementation(libs.koin)
    implementation(libs.koin.compose)

    //CameraX
    implementation(libs.camerax)
    implementation(libs.camerax.lifecycle)
    implementation(libs.camerax.video)
    implementation(libs.camerax.view)
    implementation(libs.camerax.extensions)

    //Paging
    implementation(libs.paging)
    implementation(libs.paging.ktx)
    implementation(libs.paging.rxjava3)

    //WorkManager
    implementation(libs.workManager)
    implementation(libs.workManager.ktx)

    //DataStore
    implementation(libs.dataStore)
    implementation(libs.dataStore.preferences)

    //Security
    implementation(libs.security.crypto)

    //GooglePlay
    implementation(libs.google.play.maps)
    implementation(libs.google.play.location)

    //zXing
    implementation(libs.zxing)

    //Ktor
    implementation(libs.ktor)
    implementation(libs.ktor.serialization)

    //Lottie
    implementation(libs.lottie)
}