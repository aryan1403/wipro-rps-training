package com.example.kotapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class TaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task_activity)

        val arrayAdapter: ArrayAdapter<*>
        val tasks = helper().getAllTask()

        val listView = findViewById<ListView>(R.id.tasklist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasks)

        listView.adapter = arrayAdapter
    }
}