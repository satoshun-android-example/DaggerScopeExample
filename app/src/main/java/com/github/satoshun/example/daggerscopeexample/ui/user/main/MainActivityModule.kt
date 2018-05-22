package com.github.satoshun.example.daggerscopeexample.ui.user.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {
  @ContributesAndroidInjector
  fun contributeMainActivity(): MainActivity
}
