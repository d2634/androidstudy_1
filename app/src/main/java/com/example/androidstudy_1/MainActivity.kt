package com.example.androidstudy_1

import android.app.ActionBar
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment? ?: return
        val navController = host.navController

        val bottomNav = findViewById<BottomNavigationView>(R.id.navigationView)

        bottomNav?.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.two) {
                back_title.setText("프로모션")
                back_pic1.setImageResource(R.drawable.ocean)
                back_pic2.setImageResource(R.drawable.ocean)
            }
            if(destination.id == R.id.three) {
                back_title.setText("MY 트립")
                back_pic1.setImageResource(R.drawable.boat_pic)
                back_pic2.setImageResource(R.drawable.boat_pic)

            }
        }
    }
}



