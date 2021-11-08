package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fruits: ArrayList<String> = ArrayList()
        fruits.add("Manzana")
        fruits.add("Platano")
        fruits.add("Sandia")
        fruits.add("Durazno")

        var grid: GridView = findViewById(R.id.grid)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits)

        grid.adapter = adapter

        grid.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, fruits[position], Toast.LENGTH_SHORT).show()
        }
    }

}
