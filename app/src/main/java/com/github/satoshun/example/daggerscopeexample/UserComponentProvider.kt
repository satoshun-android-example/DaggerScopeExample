package com.github.satoshun.example.daggerscopeexample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserComponentProvider {
  @Singleton
  @Provides
  fun provideUserComponent(builder: UserSubcomponent.Builder): UserSubcomponent {
    return builder.build()
  }
}
