package com.github.satoshun.example.daggerscopeexample.ui.sub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.satoshun.example.daggerscopeexample.App
import com.github.satoshun.example.daggerscopeexample.R
import com.github.satoshun.example.daggerscopeexample.UserManager
import dagger.Module
import dagger.android.ContributesAndroidInjector
import kotlinx.android.synthetic.main.activity_sub.*
import javax.inject.Inject

class UserScopedActivity : AppCompatActivity() {

  @Inject lateinit var userManager: UserManager

  override fun onCreate(savedInstanceState: Bundle?) {
    (application as App).userComponent
        .activityInjector
        .inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sub)
    user_manager.text = userManager.userId.toString()
  }
}

@Module
interface UserScopedActivityModule {
  @ContributesAndroidInjector
  fun contributeUserScopedActivity(): UserScopedActivity
}
