package com.github.satoshun.example.daggerscopeexample.ui.user.sub

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface UserScopedActivityModule {
  @ContributesAndroidInjector
  fun contributeUserScopedActivity(): UserScopedActivity
}
