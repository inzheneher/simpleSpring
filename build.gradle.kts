plugins {
    java
    id("org.springframework.boot") version "2.1.4.RELEASE"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
}

apply(plugin = "io.spring.dependency-management")

group = "org.mav"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.5.RELEASE")
    }
}

dependencies {
    implementation(
            "org.springframework",
            "spring-context",
            "5.1.6.RELEASE"
    )
    implementation(
            "org.springframework",
            "spring-web",
            "5.1.6.RELEASE"

    )
    implementation(
            "org.springframework.boot",
            "spring-boot-starter-web",
            "2.1.4.RELEASE"
    )
    testImplementation(
            "junit",
            "junit",
            "4.12"
    )
    testImplementation(
            "org.springframework",
            "spring-test",
            "5.1.6.RELEASE"
    )
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}