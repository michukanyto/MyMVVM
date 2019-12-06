package com.example.my_mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.my_mvvm.model.User

class UserViewModel: ViewModel() {

    private val user = MutableLiveData<User>()//liveData

    fun getUser(id: Int): LiveData<User> {
//        loadUser(id)
        Log.i("ViewModel ======> ","User loaded")
        return user
    }

   fun loadUser(id: Int, name:String, age:Int) {
        user.value = User(id,name, age)
    }

}