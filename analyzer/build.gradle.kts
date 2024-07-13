plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(project(":binary-resources"))
    implementation(project(":archive-patcher"))

    implementation("net.sf.jopt-simple:jopt-simple:5.0.4")

    implementation("com.android.tools.smali:smali-dexlib2:3.0.7")
    implementation("com.android.tools.smali:smali-baksmali:3.0.7")

    implementation("com.android.tools:sdk-common:31.5.1")
    implementation("com.android.tools:common:31.5.1")
    implementation("com.android.tools:sdklib:31.5.1")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}