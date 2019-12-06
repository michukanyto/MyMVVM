package com.example.my_mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.my_mvvm.R
import com.example.my_mvvm.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel

    private var id:Int? = 0
    private var name:String? = null
    private var age:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        saveButton.setOnClickListener {
            id = Integer.parseInt(idEditText.text.toString())
            name = nameEditText.text.toString()
            age = Integer.parseInt(ageEditText.text.toString())
            viewModel.loadUser(id!!, name!!,age!!)
            
            viewModel.getUser(id!!).observe(this, Observer { state ->
                Log.i("MainActivity---------> ", "${state.user?.name}")

                if (state.errorMessage == "warning") {
                    resultTextView.text = "${state.errorMessage}"
                } else {
                    resultTextView.text = "Welcome ${state.user?.name}"
                }
            })


        }

    }
}
