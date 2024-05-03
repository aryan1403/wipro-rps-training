package com.example.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class homeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    ImageView iv;
    TextView email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);
        btn = findViewById(R.id.catbtn);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        btn.setOnClickListener(this);
        // btn.setOnClickListener(e -> startActivity(new Intent(homeActivity.this, MainActivity.class)));
    }

    public void login() throws JSONException {
        // 1. get the data from input text --> username, pass
        final String emailBody = email.getText().toString();
        final String passBody = pass.getText().toString();

        // hosted url --> POST
        String url = "https://wipro-rps-training-production.up.railway.app/login";

        // 2. Request Queue
        RequestQueue reqQueue = Volley.newRequestQueue(this);

        // POST, URL, res -> Toast, err -> Toast {Body<String, String> map}
        StringRequest sreq = new StringRequest(Request.Method.POST, url,
                res -> Toast.makeText(getApplicationContext(), "Response: " + res, Toast.LENGTH_LONG).show(),
                err -> Toast.makeText(getApplicationContext(), "Error: " + err, Toast.LENGTH_LONG).show())
        {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();

                params.put("username", emailBody);
                params.put("pass", passBody);

                return params;
            }
        };

        // 3. Request Queue
        reqQueue.add(sreq);
    }



    public void getData() {
        String url = "https://wipro-rps-training-production.up.railway.app/name/Aaryan";
        // String url = "https://catfact.ninja/fact";
        RequestQueue reqQueue = Volley.newRequestQueue(this);

        StringRequest sreq = new StringRequest(Request.Method.GET, url,
                res -> {
                    //Toast.makeText(getApplicationContext(), "Response: " + res.toString(), Toast.LENGTH_LONG).show()
                    // tv.setText(res.toString());
                },
                err -> Toast.makeText(getApplicationContext(), "Error: " + err, Toast.LENGTH_LONG).show());

        reqQueue.add(sreq);
    }

    @Override
    public void onClick(View view) {
        final String apiurl = "https://cataas.com/cat/says/Aaryan";
        final String apiurl2 = "https://meowfacts.herokuapp.com/";
        if(view.getId() == btn.getId()) {
            try {
                login();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
