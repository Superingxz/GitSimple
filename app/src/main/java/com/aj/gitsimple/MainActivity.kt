package com.aj.gitsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("main","dev create")
        Log.e("main","dev-mor create")
        Log.e("main","dev-huawei create")
        Log.e("main","dev-zhi create")
    }
}