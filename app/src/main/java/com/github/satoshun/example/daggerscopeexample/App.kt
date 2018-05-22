package com.github.satoshun.example.daggerscopeexample

import com.github.satoshun.example.daggerscopeexample.ui.sub2.NoUserScopedActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Inject
import javax.inject.Scope
import javax.inject.Singleton


class App : DaggerApplication() {
  @Inject lateinit var userComponent: UserComponent

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerAppComponent.builder()
        .application(this)
        .build()
  }
}

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

  val userComponentBuilder: UserComponent.Builder
}

@Module
class UserComponentProvider {
  @Singleton
  @Provides
  fun provideUserComponent(builder: UserComponent.Builder): UserComponent {
    return builder.build()
  }
}

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class UserScope
