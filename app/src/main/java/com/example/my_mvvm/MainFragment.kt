package com.example.my_mvvm

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

class MainFragment: Fragment() {
    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("MainFragment  ", "onCreate()")
        viewModel = ViewModelProviders.of(activity!!).get(UserViewModel::class.java)

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainFragment  ", "onDestroy()")
    }
}