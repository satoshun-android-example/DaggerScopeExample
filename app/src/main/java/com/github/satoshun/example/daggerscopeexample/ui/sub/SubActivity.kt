package com.github.satoshun.example.daggerscopeexample.ui.sub

import android.os.Bundle
import com.github.satoshun.example.daggerscopeexample.R
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.DaggerAppCompatActivity

class SubActivity : DaggerAppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sub)
  }
}

@Module
interface SubActivityModule {
  @ContributesAndroidInjector
  fun contributeSubActivity(): SubActivity
}
