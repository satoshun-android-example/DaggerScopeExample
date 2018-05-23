package com.github.satoshun.example.daggerscopeexample

import com.github.satoshun.example.daggerscopeexample.ui.sub2.NoUserScopedActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
      AndroidSupportInjectionModule::class,
      NoUserScopedActivityModule::class,
      UserComponentProvider::class
    ]
)
interface AppComponent : AndroidInjector<App> {
  @Component.Builder
  interface Builder {
    @BindsInstance
    fun application(application: App): Builder

    fun build(): AppComponent
  }

  override fun inject(app: App)

  val userComponentBuilder: UserSubcomponent.Builder
}
