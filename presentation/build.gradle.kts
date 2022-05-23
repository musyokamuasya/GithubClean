import java.net.URI

buildscript {
    repositories {
        google()
        maven {
            url = uri(Url.fabric)
        }
    }

    dependencies {
//        classpath(kotlin(version = Versions.kotlin))
        classpath(BuildPlugins.androidPlugin)
        classpath(BuildPlugins.navigationSafe)
        classpath(BuildPlugins.googleService)
        classpath(BuildPlugins.fabric)
        classpath(BuildPlugins.hilt)
    }
}

allprojects {
    repositories {
        google()
        maven {
            url = URI.create(Url.jitpack)
        }
        maven {
            url = uri(Url.fabric)
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}