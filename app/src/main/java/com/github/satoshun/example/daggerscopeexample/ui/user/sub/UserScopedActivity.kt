package com.github.satoshun.example.daggerscopeexample.ui.user.sub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.satoshun.example.daggerscopeexample.AndroidInjection2
import com.github.satoshun.example.daggerscopeexample.R
import com.github.satoshun.example.daggerscopeexample.UserManager
import kotlinx.android.synthetic.main.activity_sub.*
import javax.inject.Inject

class UserScopedActivity : AppCompatActivity() {

  @Inject lateinit var userManager: UserManager

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection2.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sub)
    user_manager.text = userManager.value.toString()
  }
}
