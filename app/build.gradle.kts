plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.grupo2.ibudget"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    compileSdk = 36
=======
    compileSdk = 35
>>>>>>> 1673b31 ("se realizaron los botones de registro de usuario y el inicio de sesion , se le implemento los incons para la contraseña ")
=======
    compileSdk = 35
>>>>>>> 966050e (Agregue dos botones con iconos en la parte superior de la pantalla)
=======
    compileSdk = 34
>>>>>>> eb58c54 ("se realizaron los botones de registro de usuario y el inicio de sesion , se le implemento los incons para la contraseña ")
=======
    compileSdk = 35
>>>>>>> f24fb6a (Agregue dos botones con iconos en la parte superior de la pantalla)

    defaultConfig {
        applicationId = "com.grupo2.ibudget"
        minSdk = 24
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        targetSdk = 36
=======
        targetSdk = 35
>>>>>>> 1673b31 ("se realizaron los botones de registro de usuario y el inicio de sesion , se le implemento los incons para la contraseña ")
=======
        targetSdk = 35
>>>>>>> 966050e (Agregue dos botones con iconos en la parte superior de la pantalla)
=======
        targetSdk = 34
>>>>>>> eb58c54 ("se realizaron los botones de registro de usuario y el inicio de sesion , se le implemento los incons para la contraseña ")
=======
        targetSdk = 35
>>>>>>> f24fb6a (Agregue dos botones con iconos en la parte superior de la pantalla)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
<<<<<<< HEAD
<<<<<<< HEAD

<<<<<<< HEAD
    implementation(platform("com.google.firebase:firebase-bom:34.3.0"))
    implementation("com.google.firebase:firebase-auth")
    implementation("com.firebaseui:firebase-ui-auth:9.0.0")
<<<<<<< HEAD
    implementation("androidx.navigation:navigation-compose:2.9.5")
=======
=======
    implementation("androidx.navigation:navigation-compose:2.7.7")

>>>>>>> f1e0d59 (Thirt Commit)
    implementation ("com.airbnb.android:lottie-compose:6.6.6")
<<<<<<< HEAD
>>>>>>> 966050e (Agregue dos botones con iconos en la parte superior de la pantalla)
=======

    implementation("androidx.datastore:datastore-preferences:1.1.7")
>>>>>>> 53fb455 ("se agg una racha "")
=======
>>>>>>> eb58c54 ("se realizaron los botones de registro de usuario y el inicio de sesion , se le implemento los incons para la contraseña ")
=======

    implementation ("com.airbnb.android:lottie-compose:6.6.6")
<<<<<<< HEAD
>>>>>>> f24fb6a (Agregue dos botones con iconos en la parte superior de la pantalla)
=======

    implementation("androidx.datastore:datastore-preferences:1.1.7")
>>>>>>> 5b871c3 ("se agg una racha "")
}