plugins {
    kotlin("jvm") version "2.1.20"
    id("org.jetbrains.kotlinx.benchmark") version "0.4.13"
}

group = "wa.umiushi.kotlin_quest"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.13")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

benchmark {
    targets {
        register("main")
    }
    configurations {
        named("main")
    }
}