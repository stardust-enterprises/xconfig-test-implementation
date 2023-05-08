plugins {
    `java-library`
    id("io.freefair.lombok") version "+"
}

group = "enterprises.stardust"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    arrayOf("frontend", "middle-end", "backend").forEach {
        implementation("enterprises.stardust:xconfig-$it:0.+")
    }
}