package com.example.my_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

//    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity  ", "onCreate()")
//        viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        supportFragmentManager.beginTransaction().add(android.R.id.content, MainFragment()).commit()//content is default container

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity  ", "onDestroy()")
    }
}
