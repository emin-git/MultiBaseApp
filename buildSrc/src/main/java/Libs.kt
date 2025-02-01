
object Server {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Retrofit.RETROFIT}"
    const val GSON = "com.google.code.gson:gson:${Versions.Retrofit.GSON}"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:${Versions.Retrofit.RETROFIT}"
}

object AndroidX {
    const val CORE_KTX = "androidx.core:core-ktx${Versions.AndroidX.CORE}:"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.AndroidX.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.AndroidX.MATERIAL}"
    const val JUNIT = "androidx.test.ext:junit:${Versions.AndroidX.JUNIT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.AndroidX.ESPRESSO_CORE}"
    const val DATASTORE_PREFERENCES = "androidx.datastore:datastore-preferences:${Versions.AndroidX.DATASTORE_PREFERENCES}"
    const val WORK_RUNTIME_KTX = "androidx.work:work-runtime-ktx:${Versions.AndroidX.WORK_RUNTIME_KTX}"
    const val PAGING_RUNTIME_KTX = "androidx.paging:paging-runtime-ktx:${Versions.AndroidX.PAGING_RUNTIME_KTX}"
    const val CAMERA_CORE = "androidx.camera:camera-core:${Versions.AndroidX.CAMERA_CORE}"
    const val CAMERA_CAMERA2 = "androidx.camera:camera-camera2:${Versions.AndroidX.CAMERA_CORE}"
    const val CAMERA_LIFECYCLE = "androidx.camera:camera-lifecycle:${Versions.AndroidX.CAMERA_CORE}"
    const val CAMERA_VIEW = "androidx.camera:camera-view:${Versions.AndroidX.CAMERA_CORE}"
    const val CAMERA_EXTENSIONS = "androidx.camera:camera-extensions:${Versions.AndroidX.CAMERA_CORE}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.AndroidX.ROOM_RUNTIME}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.AndroidX.ROOM_RUNTIME}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.AndroidX.ROOM_RUNTIME}"
}

object Compose {
    const val UI = "androidx.compose.ui:ui:${Versions.Compose.COMPOSE}"
    const val UI_GRAPHICS = "androidx.compose.ui:ui-graphics:${Versions.Compose.COMPOSE}"
    const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.COMPOSE}"
    const val MATERIAL3 = "androidx.compose.material3:material3:${Versions.Compose.MATERIAL3}"
    const val RUNTIME = "androidx.compose.runtime:runtime:${Versions.Compose.COMPOSE}"
    const val FOUNDATION = "androidx.compose.foundation:foundation:${Versions.Compose.COMPOSE}"
    const val MATERIAL_ICONS_CORE = "androidx.compose.material:material-icons-core:${Versions.Compose.COMPOSE}"
    const val MATERIAL_ICONS_EXTENDED = "androidx.compose.material:material-icons-extended:${Versions.Compose.COMPOSE}"
    const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.Compose.COMPOSE}"
    const val LIFECYCLE_VIEWMODEL_COMPOSE = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.Compose.COMPOSE}"
}

object Lifecycle {
    const val VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Lifecycle.LIFECYCLE}"
    const val LIVEDATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Lifecycle.LIFECYCLE}"
}

object Hilt {
    const val ANDROID = "com.google.dagger:hilt-android:${Versions.Hilt.HILT}"
    const val COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.Hilt.HILT}"
    const val NAVIGATION_COMPOSE = "androidx.hilt:hilt-navigation-compose:${Versions.Hilt.HILT_NAVIGATION_COMPOSE}"
}

object Image {
    const val GLIDE = "com.github.bumptech.glide:glide:${Versions.Glide.GLIDE}"
}

object Binding {
    const val DATA_BINDING = "androidx.databinding:databinding-runtime:${Versions.DataBinding.DATA_BINDING}"
    const val VIEW_BINDING = "androidx.databinding:viewbinding:${Versions.DataBinding.DATA_BINDING}"
}

object Navigation {
    const val FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${Versions.Navigation.NAVIGATION}"
    const val UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.Navigation.NAVIGATION}"
}

object Ui {
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${Versions.Ui.RECYCLER}"
    const val CARDVIEW = "androidx.cardview:cardview:${Versions.Ui.CARD_VIEW}"
}

object Koin {
    const val ANDROID = "io.insert-koin:koin-android:${Versions.Koin.KOIN}"
    const val ANDROIDX_COMPOSE = "io.insert-koin:koin-androidx-compose:${Versions.Koin.KOIN}"
}

object Coroutines {
    const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutine.COROUTINE}"
}

object Firebase {
    const val BOM = "com.google.firebase:firebase-bom:${Versions.Retrofit.RETROFIT}"
    const val AUTH_KTX = "com.google.firebase:firebase-auth-ktx:${Versions.Retrofit.RETROFIT}"
}

object Junit {
    const val JUNIT = "junit:junit:${Versions.AndroidX.JUNIT}"
}