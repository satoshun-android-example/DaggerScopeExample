package com.github.satoshun.example.daggerscopeexample

import android.app.Activity
import dagger.android.AndroidInjection

object AndroidInjection2 {
  fun inject(activity: Activity) {
    val app = activity.application as App
    if (app.userComponent.activityInjector.maybeInject(activity)) {
      return
    }
    AndroidInjection.inject(activity)
  }
}
