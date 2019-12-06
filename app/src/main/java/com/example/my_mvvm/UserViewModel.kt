package com.example.my_mvvm

import android.util.Log
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {

    init {
        Log.i("My viewModel : ", "init()")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("My viewModel : ", "onCleared()")
    }
}