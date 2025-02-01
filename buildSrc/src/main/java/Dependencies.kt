import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

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

fun Project.libs() = extensions.getByType<VersionCatalogsExtension>().named("libs")

fun DependencyHandler.compose(project: Project) {
    listOf(
        "compose-ui",
        "compose-material",
        "compose-tooling",
        "compose-runtime",
        "compose-foundation",
        "compose-activity"
    ).forEach { add("implementation", project.libs().findLibrary(it).get()) }
}

fun DependencyHandler.androidX(project: Project) {
    listOf(
        "androidx-core-ktx",
        "androidx-appcompat",
        "androidx-junit",
        "androidx-espresso-core",
        "material"
    ).forEach { add("implementation", project.libs().findLibrary(it).get()) }
}

fun DependencyHandler.retrofit(project: Project) {
    listOf(
        "retrofit",
        "gson",
        "converter-gson"
    ).forEach { add("implementation", project.libs().findLibrary(it).get()) }
}