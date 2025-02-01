import org.gradle.api.artifacts.dsl.DependencyHandler

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

object DefaultConfig {
    const val sdk = 35
    const val minsdk = 24
    const val appNane = "com.emin.multibaseapp"
    const val jvm = "11"
    const val kotlinVersion = "1.9.24"
}

fun DependencyHandler.retrofit(){
    implementation(Server.RETROFIT)
    implementation(Server.GSON)
    implementation(Server.CONVERTER_GSON)
}

fun DependencyHandler.androidX(){
    implementation(AndroidX.CORE_KTX)
    implementation(AndroidX.APPCOMPAT)
    implementation(AndroidX.MATERIAL)
    implementation(AndroidX.JUNIT)
    implementation(AndroidX.ESPRESSO_CORE)
    implementation(AndroidX.DATASTORE_PREFERENCES)
    implementation(AndroidX.WORK_RUNTIME_KTX)
    implementation(AndroidX.PAGING_RUNTIME_KTX)
    implementation(AndroidX.CAMERA_CORE)
    implementation(AndroidX.CAMERA_CAMERA2)
    implementation(AndroidX.CAMERA_LIFECYCLE)
    implementation(AndroidX.CAMERA_VIEW)
    implementation(AndroidX.CAMERA_EXTENSIONS)
    implementation(AndroidX.ROOM_RUNTIME)
    implementation(AndroidX.ROOM_KTX)
    implementation(AndroidX.ROOM_COMPILER)
}

fun DependencyHandler.lifecycle(){
    implementation(Lifecycle.VIEWMODEL_KTX)
    implementation(Lifecycle.LIVEDATA_KTX)
}

fun DependencyHandler.compose() {
    implementation(Compose.UI)
    implementation(Compose.UI_GRAPHICS)
    implementation(Compose.UI_TOOLING_PREVIEW)
    implementation(Compose.MATERIAL3)
    implementation(Compose.RUNTIME)
    implementation(Compose.FOUNDATION)
    implementation(Compose.MATERIAL_ICONS_CORE)
    implementation(Compose.MATERIAL_ICONS_EXTENDED)
    implementation(Compose.ACTIVITY_COMPOSE)
    implementation(Compose.LIFECYCLE_VIEWMODEL_COMPOSE)
}

fun DependencyHandler.image(){
    implementation(Image.GLIDE)
}

fun DependencyHandler.hilt(){
    implementation(Hilt.ANDROID)
    kapt(Hilt.COMPILER)
    implementation(Hilt.NAVIGATION_COMPOSE)
}

fun DependencyHandler.binding(){
    implementation(Binding.DATA_BINDING)
    implementation(Binding.VIEW_BINDING)
}

fun DependencyHandler.navigation(){
    implementation(Navigation.FRAGMENT_KTX)
    implementation(Navigation.UI_KTX)
}

fun DependencyHandler.ui(){
    implementation(Ui.RECYCLERVIEW)
    implementation(Ui.CARDVIEW)
}

fun DependencyHandler.koin(){
    implementation(Koin.ANDROID)
    implementation(Koin.ANDROIDX_COMPOSE)
}

fun DependencyHandler.coroutines(){
    implementation(Coroutines.ANDROID)
}

fun DependencyHandler.firebase(){
    implementation(platform(Firebase.BOM))
    implementation(Firebase.AUTH_KTX)
}

fun DependencyHandler.jUnit(){
    testImplementation(Junit.JUNIT)
}

internal fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

internal fun DependencyHandler.implementation(depName: Any) {
    add("implementation", depName)
}

internal fun DependencyHandler.kapt(depName: String){
    add("kapt",depName)
}

internal fun DependencyHandler.kapt(depName:Any){
    add("kapt",depName)
}

internal fun DependencyHandler.testImplementation(depName:String){
    add("testImplementation",depName)
}

internal fun DependencyHandler.testImplementation(depName:Any){
    add("androidTestImplementation",depName)
}