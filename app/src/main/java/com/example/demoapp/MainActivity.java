package com.example.demoapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.demoapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    EditText name, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(this);

        name = findViewById(R.id.namebox);
        pass = findViewById(R.id.passbox);

    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if(view == btn) {
            String nt = name.getText().toString();
            String pt = pass.getText().toString();

            if(nt.equals("aryan") && pt.equals("123")) {
                // logged in successfully
                Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_LONG).show();

                // Navigate to a new Page
            } else {
                Toast.makeText(MainActivity.this, "Incorrect Credentials", Toast.LENGTH_LONG).show();
            }
        }
    }
}