package com.github.satoshun.example.daggerscopeexample.ui.sub2

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface NoUserScopedActivityModule {
  @ContributesAndroidInjector
  fun contributeNoUserScopedActivity(): NoUserScopedActivity
}
