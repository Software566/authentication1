buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // Use the correct Android Gradle plugin version (e.g., 8.2.0 or the latest stable version)
        classpath("com.android.tools.build:gradle:8.8.0")
        // Use the updated version of Google Services plugin
        classpath("com.google.gms:google-services:4.4.2")
    }
}