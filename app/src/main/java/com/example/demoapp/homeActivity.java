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

public class homeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    ImageView iv;

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);
        btn = findViewById(R.id.catbtn);
        tv = findViewById(R.id.facts);

        btn.setOnClickListener(this);
        // btn.setOnClickListener(e -> startActivity(new Intent(homeActivity.this, MainActivity.class)));
    }

    public void facts() throws  IOException {
        URL url = new URL("https://meowfacts.herokuapp.com/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }


        System.out.println(content.toString());
        tv.setText(content.toString());

        Toast.makeText(homeActivity.this, "called the api", Toast.LENGTH_LONG).show();

        con.disconnect();
        in.close();
    }

//    public String getFacts() throws IOException {
//        RequestQueue volleyQueue = Volley.newRequestQueue(homeActivity.this);
//
//        String url = "https://meowfacts.herokuapp.com/";
//        JsonObjectRequest json = new JsonObjectRequest(url,(Response.Listener<JSONObject>) res -> {
//            try {
//                JSONArray ja = res.getJSONArray("data");
//
//                String fact = ja.getString(0);
//
//                tv.setText(fact);
//
//            } catch (JSONException e) {
//                throw new RuntimeException(e);
//            }
//        } , (Response.ErrorListener) error -> {
//            Toast.makeText(homeActivity.this, "Some error occurred! Cannot fetch fact", Toast.LENGTH_LONG).show();
//            // log the error message in the error stream
//        } );
//
//        volleyQueue.add(json);
//        return null;
//    }

    public void checkApi(String uri) throws IOException {
        URL url = new URL(uri);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            StringBuilder s = new StringBuilder();
            while(in.read() != -1) {
                s.append((char) in.read());
            }

            tv.setText(s.toString());
        } finally {
            urlConnection.disconnect();
        }
    }
    public void httpCall(String url) {
        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                (Response.Listener<String>) res -> {
                    tv.setText(res);
                    btn.setText(res);
                    Toast.makeText(homeActivity.this, "fetched", Toast.LENGTH_LONG).show();
                }, (Response.ErrorListener) err -> {
            Toast.makeText(homeActivity.this, "error", Toast.LENGTH_LONG).show();
        });

        queue.add(stringRequest);
    }

    public void getData() {
        String url = "http://49.43.163.38:8080/";
        // String url = "https://catfact.ninja/fact";
        RequestQueue reqQueue = Volley.newRequestQueue(this);

        StringRequest sreq = new StringRequest(Request.Method.GET, url,
                res -> {
                    //Toast.makeText(getApplicationContext(), "Response: " + res.toString(), Toast.LENGTH_LONG).show()
                    tv.setText(res.toString());
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
                getData();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
