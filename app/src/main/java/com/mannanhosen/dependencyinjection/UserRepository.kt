package com.mannanhosen.dependencyinjection
import android.R.id.message
import jakarta.inject.Inject

class UserRepository @Inject constructor(
    private val loggerService: LoggerService
){

    fun saveUser(email : String, password : String){
        loggerService.log("user save in db", message)
    }

    }
