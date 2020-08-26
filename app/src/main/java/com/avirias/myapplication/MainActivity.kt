package com.avirias.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

     fun increaseSize(view: View){
        Toast.makeText(applicationContext,"adssaddsa",Toast.LENGTH_SHORT).show()
    }
}