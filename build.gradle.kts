plugins {
    java
}

group = "org.mav"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(
            "junit",
            "junit",
            "4.12")
    implementation(
            "org.springframework",
            "spring-context",
            "5.1.6.RELEASE")
    testImplementation(
            "org.springframework",
            "spring-test",
            "5.1.6.RELEASE")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}