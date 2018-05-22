package com.github.satoshun.example.daggerscopeexample.ui.user.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.satoshun.example.daggerscopeexample.AndroidInjection2
import com.github.satoshun.example.daggerscopeexample.R
import com.github.satoshun.example.daggerscopeexample.UserManager
import com.github.satoshun.example.daggerscopeexample.ui.sub2.NoUserScopedActivity
import com.github.satoshun.example.daggerscopeexample.ui.user.sub.UserScopedActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

  @Inject lateinit var userManager: UserManager

  private lateinit var task: Thread

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection2.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    user_scoped.setOnClickListener {
      startActivity(Intent(this,
          UserScopedActivity::class.java))
    }
    no_user_scoped.setOnClickListener {
      startActivity(Intent(this,
          NoUserScopedActivity::class.java))
    }
  }

  override fun onResume() {
    super.onResume()
    task = thread {
      try {
        while (!Thread.interrupted()) {
          Thread.sleep(500)
          userManager.value += 1
          runOnUiThread { value.text = userManager.value.toString() }
        }
      } catch (e: Exception) {
        // ignore
      }
    }
  }

  override fun onPause() {
    super.onPause()
    task.interrupt()
  }
}
