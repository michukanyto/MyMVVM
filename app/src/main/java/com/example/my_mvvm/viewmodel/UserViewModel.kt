package com.example.my_mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.my_mvvm.model.User


class MyViewModelState (val user: User?, val errorMessage:String = "" , val buttonVisibility:Boolean = true)



class UserViewModel: ViewModel() {

//    private val user = MutableLiveData<User>()//liveData
//
//    fun getUser(id: Int): LiveData<User> {
////        Log.i("ViewModel ======> ","User loaded")
//        return user
//    }
//
//   fun loadUser(id: Int, name:String, age:Int) {
//        user.value = User(id,name, age)
//    }

    ///////// To control states in my ViewModel ///////////

    private val user = MutableLiveData<MyViewModelState>()

    fun loadUser(id: Int, name:String, age:Int) {
        user.value = MyViewModelState(createUser(id,name,age),"warning",true)
    }

    private fun createUser(id: Int, name:String, age:Int): User? {
        val user1 = User(id,name,age)
        return user1
    }

    fun getUser(id: Int): LiveData<MyViewModelState> {
//        Log.i("ViewModel ======> ","User loaded")
        return user
    }

}