plugins {
    id("com.android.application")
    id ("com.google.gms.google-services")

}

android {
    namespace = "com.example.text_recognizer"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.text_recognizer"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation ("com.google.firebase:firebase-bom:32.2.2") /*used to be implementation platform()*/
    /*implementation("androidx.appcompat:appcompat:1.6.1")*/
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.google.firebase:firebase-core:15.0.2") /*same as below*, changed analytics to core*/
    implementation("com.google.firebase:firebase-ml-vision:15.0.0") /*pasted from doc no version provided there*/
    testImplementation("junit:junit:4.13.2")
    implementation ("com.google.firebase:firebase-ml-vision-image-label-model:200.1")// For text recognition

    implementation ("com.google.android.gms:play-services-mlkit-text-recognition:24.0.1")

    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}