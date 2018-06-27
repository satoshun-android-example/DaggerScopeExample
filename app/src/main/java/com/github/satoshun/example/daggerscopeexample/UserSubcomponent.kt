package com.github.satoshun.example.daggerscopeexample

import android.app.Activity
import com.github.satoshun.example.daggerscopeexample.ui.user.main.MainActivityModule
import com.github.satoshun.example.daggerscopeexample.ui.user.sub.UserScopedActivityModule
import dagger.Subcomponent
import dagger.android.DispatchingAndroidInjector

@UserScope
@Subcomponent(modules = [
  MainActivityModule::class,
  UserScopedActivityModule::class
])
interface UserSubcomponent {
  @Subcomponent.Builder
  interface Builder {
    fun build(): UserSubcomponent
  }

  val activityInjector: DispatchingAndroidInjector<Activity>
}
