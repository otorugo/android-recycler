package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.databinding.ActivityMainBinding
import com.example.recycler.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter = DataAdapter()
        adapter.setData(DataSource.generateData())
        binding.listItem.adapter = adapter
        binding.listItem.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}