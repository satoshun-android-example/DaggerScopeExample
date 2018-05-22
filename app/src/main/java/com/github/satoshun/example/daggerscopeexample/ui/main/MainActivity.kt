package com.github.satoshun.example.daggerscopeexample.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.satoshun.example.daggerscopeexample.App
import com.github.satoshun.example.daggerscopeexample.R
import com.github.satoshun.example.daggerscopeexample.UserManager
import com.github.satoshun.example.daggerscopeexample.ui.sub.UserScopedActivity
import com.github.satoshun.example.daggerscopeexample.ui.sub2.NoUserScopedActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject lateinit var userManager: UserManager

  override fun onCreate(savedInstanceState: Bundle?) {
    (application as App).userComponent
        .activityInjector
        .inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    user_scoped.setOnClickListener {
      startActivity(Intent(this, UserScopedActivity::class.java))
    }
    no_user_scoped.setOnClickListener {
      startActivity(Intent(this, NoUserScopedActivity::class.java))
    }
    userManager.userId = 200
  }
}

@Module
interface MainActivityModule {
  @ContributesAndroidInjector
  fun contributeMainActivity(): MainActivity
}
