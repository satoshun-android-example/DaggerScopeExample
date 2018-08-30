object Vers {
  val compile_sdk = 28
  val min_sdk = 25
  val target_sdk = 28
  val agp = "3.1.4"

  val kotlin = "1.2.61"
  val support_lib = "27.1.1"
}

object Libs {
  val android_plugin = "com.android.tools.build:gradle:${Vers.agp}"
  val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"

  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"

  val design = "com.android.support:design:${Vers.support_lib}"
  val support_v4_core = "com.android.support:support-core-ui:${Vers.support_lib}"
  val appcompat_v7 = "com.android.support:appcompat-v7:${Vers.support_lib}"
  val support_annotations = "com.android.support:support-annotations:${Vers.support_lib}"
  val recyclerview = "com.android.support:recyclerview-v7:${Vers.support_lib}"
  val support_v4 = "com.android.support:support-v4:${Vers.support_lib}"
  val constraint_layout = "com.android.support.constraint:constraint-layout:1.1.0"

  val viewmodel = "android.arch.lifecycle:viewmodel:1.1.1"
  val livedata = "android.arch.lifecycle:livedata:1.1.1"
  val gms = "com.google.android.gms:play-services-location:15.0.0"

  val dagger = "com.google.dagger:dagger:2.17"
  val dagger_compiler = "com.google.dagger:dagger-compiler:2.17"
  val dagger_android = "com.google.dagger:dagger-android:2.17"
  val dagger_android_support = "com.google.dagger:dagger-android-support:2.17"
  val dagger_android_compiler = "com.google.dagger:dagger-android-processor:2.17"

  val junit = "junit:junit:4.12"
  val support_test = "com.android.support.test:runner:1.0.1"
  val espresso = "com.android.support.test.espresso:espresso-core:3.0.1"
  val arch_test = "android.arch.core:core-testing:1.1.1"

  val truth = "com.google.truth:truth:0.39"
  val mockito_kotlin = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
  val multidex = "com.android.support:multidex:1.0.3"
}
