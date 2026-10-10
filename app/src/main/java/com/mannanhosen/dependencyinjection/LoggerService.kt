package com.mannanhosen.dependencyinjection

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun log(message: String, string: Int) {
        Log.d("user save in db", message)
    }
}