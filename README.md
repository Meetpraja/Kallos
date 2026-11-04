
# Kallos

**Beautiful components. Simpler development.**

Kallos is an open-source Android UI component library built using **Kotlin** and **Jetpack Compose**.

The name **Kallos** comes from the Greek word *κάλλος*, meaning **beauty**.

The goal of Kallos is to simplify Android UI development by providing reusable, customizable, and developer-friendly Compose components.

[![JitPack](https://jitpack.io/v/Meetpraja/Kallos.svg)](https://jitpack.io/#Meetpraja/Kallos)
![Kotlin](https://img.shields.io/badge/Kotlin-Android-blueviolet)
![Jetpack Compose](https://img.shields.io/badge/Jetpack-Compose-4285F4)

---

## Features

- Built with Kotlin and Jetpack Compose
- Reusable UI components
- Customizable component properties
- Easy integration using JitPack
- Lightweight and developer-friendly
- Designed for modern Android applications
- More components coming soon

---

## Installation

Kallos is available through **JitPack**.

### Step 1: Add JitPack Repository

Open your project's `settings.gradle.kts` file.

Add the JitPack repository inside `dependencyResolutionManagement`:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
```

### Step 2: Add Kallos Dependency

Open your app-level `build.gradle.kts` file.

Add the following dependency:

```kotlin
dependencies {
    implementation("com.github.Meetpraja:Kallos:VERSION")
}
```

Replace `VERSION` with your published release tag.

Check available versions:

https://jitpack.io/#Meetpraja/Kallos

### Step 3: Sync Project

Click **Sync Now** in Android Studio.

Once Gradle synchronization completes, you can start using Kallos components.

---

## Available Components

### 1. Custom TextField

A reusable Jetpack Compose TextField component.

**Features:**

- Reusable composable function
- Supports text input
- Supports Compose state management
- Easy integration into Android screens
- Customizable through supported parameters

**Usage:**

Import the TextField component from the Kallos library and use it inside your `@Composable` function.

Check the library source code for the exact function name, import path, and available parameters.

More components will be added in upcoming releases.

---

## Project Structure

```text
Kallos/
│
├── app/
│   └── Example Android application
│
├── kallos/
│   └── Reusable Jetpack Compose components
│
├── gradle/
│   └── Gradle configuration
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## Publishing a New Version

Follow these steps whenever you add or update a component.

### Step 1: Update Library

Add new components or modify existing components inside the library module.

### Step 2: Test Components

Run the example Android application and verify that the components work correctly.

### Step 3: Commit Changes

```bash
git add .
git commit -m "feat: add new UI component"
git push origin main
```

### Step 4: Create a Version Tag

For example, to publish version `v1.0.1`:

```bash
git tag v1.0.1
git push origin v1.0.1
```

Always use a new version tag for each release.

### Step 5: Build on JitPack

Visit:

https://jitpack.io/#Meetpraja/Kallos

Select the new version and verify that the build succeeds.

### Step 6: Update Dependency

In the consuming Android project:

```kotlin
implementation("com.github.Meetpraja:Kallos:v1.0.1")
```

Sync Gradle to use the new release.

---

## Roadmap

The following components are planned for future releases.

### Input Components

- [x] Custom TextField
- [ ] Password TextField
- [ ] Search TextField
- [ ] OTP Input
- [ ] Dropdown Menu

### Buttons and Selection

- [ ] Custom Button
- [ ] Icon Button
- [ ] Checkbox
- [ ] Radio Button
- [ ] Switch
- [ ] Segmented Button

### Layout Components

- [ ] Custom Card
- [ ] List Item
- [ ] Bottom Navigation
- [ ] Navigation Drawer
- [ ] Tab Bar

### Feedback Components

- [ ] Custom Dialog
- [ ] Snackbar
- [ ] Toast
- [ ] Loading Indicator
- [ ] Progress Bar
- [ ] Skeleton Loader

### Advanced Components

- [ ] Date Picker
- [ ] Time Picker
- [ ] Bottom Sheet
- [ ] Search Bar
- [ ] Image Picker

---

## Contributing

Contributions are welcome!

If you would like to improve Kallos:

1. Fork the repository.
2. Create a new feature branch.
3. Implement your changes.
4. Test your implementation.
5. Commit your changes.
6. Submit a pull request.

Please keep components reusable, readable, and consistent with Jetpack Compose best practices.

---

## License

A license has not yet been specified for this project.

---

## Author

**Mit Prajapati**

GitHub: [@Meetpraja](https://github.com/Meetpraja)

Repository: [Kallos](https://github.com/Meetpraja/Kallos)

---

### Kallos — Beautiful components. Simpler development.

*Built with Kotlin and Jetpack Compose.*
