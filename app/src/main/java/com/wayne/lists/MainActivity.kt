package com.wayne.lists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myListView: ListView = findViewById(R.id.listCities)
//data
        val cities = arrayOf(
            "Nairobi",
            "Mombasa",
            "Joeburg",
            "Kisumu",
            "Kigali",
            "Arusha",
            "Abuja",
            "Mogadishu",
            "Djibout",
            "Eldoret",
            "Manchester",
            "London"
        )
        Log.d("_CITIES","We have ${cities.size} cities")
        Log.d("XYZ",cities[1])
//adapter
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,cities)
//tell the list which adapter to use
        myListView.adapter = adapter

        myListView.onItemClickListener = AdapterView.OnItemClickListener{_,_,position,_->
            val city = cities[position]
            Toast.makeText(this,city,Toast.LENGTH_SHORT).show()
            Log.d("_CITIES","City that was clicked is $city")
            Log.e("_CITIES","Position is e $position")

            val intent =Intent(this, SecondActivity::class.java)
            //pass data between activities
            intent.putExtra("name",city)
            intent.putExtra("position",position)
            //open activity
            startActivity(intent)

        }

    }
}