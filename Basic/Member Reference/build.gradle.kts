plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "com.hkmtech.memberreference"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.4.31")
}
