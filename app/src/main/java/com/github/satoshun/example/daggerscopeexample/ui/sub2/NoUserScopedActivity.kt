package com.github.satoshun.example.daggerscopeexample.ui.sub2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.satoshun.example.daggerscopeexample.R
import dagger.Module
import dagger.android.AndroidInjection
import dagger.android.ContributesAndroidInjector

class NoUserScopedActivity : AppCompatActivity() {

//  @Inject lateinit var userManager: UserManager

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_no_user_scoped)
  }
}

@Module
interface NoUserScopedActivityModule {
  @ContributesAndroidInjector
  fun contributeNoUserScopedActivity(): NoUserScopedActivity
}
