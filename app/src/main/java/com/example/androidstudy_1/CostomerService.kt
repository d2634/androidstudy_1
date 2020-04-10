package com.example.androidstudy_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_four.*
import kotlinx.android.synthetic.main.service_costomer.*


class CostomerService : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.service_costomer)
        setSupportActionBar(toolbar_n)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        chatting.setOnClickListener { val intent = Intent(this, ChattingActivity::class.java)
            startActivity(intent)}
    }
}