package com.github.satoshun.example.daggerscopeexample

import com.github.satoshun.example.daggerscopeexample.ui.main.MainActivityModule
import com.github.satoshun.example.daggerscopeexample.ui.sub.SubActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {
  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerAppComponent.builder()
        .application(this)
        .build()
  }
}

@Component(
    modules = [
      AndroidSupportInjectionModule::class,
      MainActivityModule::class,
      SubActivityModule::class
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
}
