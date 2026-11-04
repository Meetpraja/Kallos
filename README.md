# Kallos

## Android build setup

The app compiles against Android API 37. Its AndroidX Core 1.19.1 and
Lifecycle 2.11.0 dependencies require at least that API level. `minSdk = 24`
still controls device compatibility; `targetSdk = 36` still controls runtime
behavior opt-ins. Neither needs to change to fix this metadata error.

Use Android Studio's SDK Manager to install Android SDK Platform 37, and use
the project's Gradle wrapper with JDK 21 (Android Studio's bundled JDK works).
Then sync the project and run:

```sh
./gradlew :app:assembleDebug
```

## Starting another project

SDK installations are shared on this computer, but each project's build
configuration is independent. Installing API 37 alone does not change the
compile SDK selected by a new-project template.

For a new project using these dependency versions, set this in the app's
`build.gradle.kts` before the first build:

```kotlin
android {
    compileSdk = 37
}
```

Replace any existing `compileSdk { ... }` block with that assignment. Choose
`minSdk` based on the devices you support, independently of `compileSdk`.

Use Android Gradle plugin 9.1.1 or newer with API 37, and an Android Studio
version that supports it (Panda 3 / 2025.3.3 Patch 1 or newer). This project's
AGP 9.1.1 and Gradle 9.3.1 wrapper provide a matching starting point. Keep
dependency versions explicit in `gradle/libs.versions.toml`; avoid dynamic
versions such as `1.+` or `latest.release`.

When upgrading dependencies, check their required compile SDK and the
corresponding AGP/Gradle requirements together. Build the new project before
adding more libraries. A working starter configuration reduces setup errors,
but no global SDK setting can guarantee that all future dependency versions
will build without changes. Do not bypass AAR metadata checks.

Official compatibility reference:
https://developer.android.com/build/releases/about-agp
