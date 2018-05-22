package com.github.satoshun.example.daggerscopeexample

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject


class App : DaggerApplication() {
  @Inject lateinit var userComponent: UserComponent

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerAppComponent.builder()
        .application(this)
        .build()
  }
}
