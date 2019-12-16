package com.example.modularapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //start activity from module one
        val intent = Intent().setClassName(BuildConfig.APPLICATION_ID, "com.example.feature_one.FeatureActivity")
        startActivity(intent)
    }
}

