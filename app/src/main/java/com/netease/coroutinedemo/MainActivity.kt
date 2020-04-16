package com.netease.coroutinedemo

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runBlocking {

        }
    }


    fun asyncTest() {
        runBlocking {
            async {  }
        }
    }


    fun launchTest() {
        runBlocking {
            launch {
            }
        }
    }

    fun produceTest() {
        runBlocking {
//            produce {
//            }
        }
    }

    suspend fun suspendTest() {

    }
}

