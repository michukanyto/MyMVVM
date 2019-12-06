package com.example.my_mvvm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.my_mvvm.viewmodel.UserViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun shouldLoadUserEqual_3() {
        val viewModel = UserViewModel()
        val userId = 3
        val user = viewModel.loadUser(3,"Louisse",25)
        val liveData = viewModel.getUser(userId)
        assertEquals(userId, liveData.value!!.user?.id)
    }
}
