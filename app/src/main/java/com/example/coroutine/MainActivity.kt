package com.example.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.coroutine.retrofit.ApiInterface
import com.example.coroutine.retrofit.ApiUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var apiInterface: ApiInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiInterface = ApiUtils.getApi()


        lifecycleScope.launch(IO) {

            try {

                var response = apiInterface.getAllPost()


                Log.d("response", response.toString())
            } catch (e: Exception) {
                Log.d("ex", e.message.toString())
            }

        }
    }



}