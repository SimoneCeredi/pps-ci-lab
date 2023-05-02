plugins {
    java
    scala
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
