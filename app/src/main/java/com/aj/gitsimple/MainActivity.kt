package com.aj.gitsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("main","dev create")
        Log.e("main","dev_zhi create")
        Log.e("main","maser update1")
    }
}