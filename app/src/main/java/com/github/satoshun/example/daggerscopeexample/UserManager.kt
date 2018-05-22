package com.github.satoshun.example.daggerscopeexample

import javax.inject.Inject

@UserScope
class UserManager @Inject constructor() {
  var userId = 100
}
