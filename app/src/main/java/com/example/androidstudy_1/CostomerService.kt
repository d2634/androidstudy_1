package com.example.androidstudy_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.service_costomer.*


class CostomerService : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.service_costomer)
        setSupportActionBar(toolbar_n)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
    }
}