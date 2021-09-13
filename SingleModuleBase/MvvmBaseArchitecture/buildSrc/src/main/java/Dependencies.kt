object Apps {
    const val compileSdk = 30
    const val buildTools = "30.0.3"

    const val minSdk = 21
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "0.0.0"
}

object Versions {
    const val gradle = "3.5.2"
    object Kotlin {
        const val version = "1.5.21"
    }
    const val appcompat = "1.3.0"
    const val junit = "4.12"
}

object Dependencies {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.1"
    object AndroidX {
        const val core = "androidx.core:core-ktx:1.6.0"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material:1.4.0"
    }
    object Kotlin{
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin.version}"
    }
    object Test {
        const val junit = "junit:junit:4.13.2"
        const val junitExt = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
        const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:3.2.0"
    }

}