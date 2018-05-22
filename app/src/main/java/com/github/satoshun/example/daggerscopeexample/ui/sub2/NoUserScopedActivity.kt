package com.github.satoshun.example.daggerscopeexample.ui.sub2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.satoshun.example.daggerscopeexample.AndroidInjection2
import com.github.satoshun.example.daggerscopeexample.R

class NoUserScopedActivity : AppCompatActivity() {

//  compile error if added below code
//  @Inject lateinit var userManager: UserManager

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection2.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_no_user_scoped)
  }
}
