package com.wayne.lists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtName : TextView = findViewById(R.id.txtCity)
        val txtPost : TextView = findViewById(R.id.txtPosition)

        val font = ResourcesCompat.getFont(this,R.font.begin)
        txtName.typeface = font
        txtPost.typeface = font

        val intent :Intent = intent
        val nameCity = intent.getStringExtra("name")
        val postCity = intent.getIntExtra("position",0)

        txtName.text = nameCity
        txtPost.text = postCity.toString()

        val actionBar = supportActionBar
        actionBar!!.title = nameCity
    }
}