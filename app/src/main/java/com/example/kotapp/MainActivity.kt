package com.example.kotapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.kotapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val tasks = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val task = findViewById<TextView>(R.id.taskbar)
        val btn = findViewById<Button>(R.id.addtask)
        val btn1 = findViewById<Button>(R.id.btn1)
        val helper = helper()

        btn.setOnClickListener() {
            Toast.makeText(this@MainActivity, "Task Added", Toast.LENGTH_LONG).show()
            tasks.add(task.text.toString())
        }

        btn1.setOnClickListener() {
            helper.replaceTasks(tasks)
            startActivity(Intent(this, TaskActivity::class.java))
        }
    }


}