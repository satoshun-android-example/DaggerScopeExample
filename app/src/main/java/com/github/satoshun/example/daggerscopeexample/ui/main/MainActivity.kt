package com.github.satoshun.example.daggerscopeexample.ui.main

import android.content.Intent
import android.os.Bundle
import com.github.satoshun.example.daggerscopeexample.R
import com.github.satoshun.example.daggerscopeexample.ui.sub.SubActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    next.setOnClickListener {
      startActivity(Intent(this, SubActivity::class.java))
    }
  }
}

@Module
interface MainActivityModule {
  @ContributesAndroidInjector
  fun contributeMainActivity(): MainActivity
}
