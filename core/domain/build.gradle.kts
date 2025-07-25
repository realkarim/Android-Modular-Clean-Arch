import dependency.kotlinx
import dependency.testDebugDeps
import dependency.testDeps
import dependency.testImplDeps
import plugin.SharedLibraryGradlePlugin

plugins {
  id(plugin.BuildPlugins.ANDROID_LIBRARY)
}

android {
  namespace = "com.realkarim.domain"
}

apply<SharedLibraryGradlePlugin>()

dependencies {
  kotlinx()
  testDeps()
  testImplDeps()
  testDebugDeps()
}
