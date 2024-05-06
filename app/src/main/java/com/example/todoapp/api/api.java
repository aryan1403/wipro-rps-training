package com.example.todoapp.api;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.todoapp.R;
import com.google.android.material.snackbar.Snackbar;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;
public class api {
    String api_uri = "https://wipro-rps-training.onrender.com";
    public void createTodo(String title, String desc, String owner, View view, Context context) throws JSONException {
        // hosted url --> POST
        String url = api_uri + "/disable/66385fe7f7ae3de048457139";

        // 2. Request Queue
        RequestQueue reqQueue = Volley.newRequestQueue(context);


        // POST, URL, res -> Toast, err -> Toast {Body<String, String> map}
         JsonObjectRequest jsonreq = new JsonObjectRequest(Request.Method.PUT, url, null,
                res -> {
                    Log.e("ok", res.toString());
                    Snackbar.make(view, "Res" + res.toString(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null)
                            .setAnchorView(R.id.fab).show();
                },
                err -> {
                    err.printStackTrace();
                    Log.i("ok", err.toString());
                    Snackbar.make(view, "Error: " + err.toString(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null)
                            .setAnchorView(R.id.fab).show();
                }
        ){
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();

                params.put("id", title);
                params.put("desc", desc);
                params.put("active", "true");
                params.put("owner", owner);

                return params;
            }
        };

        // 3. Request Queue
        reqQueue.add(jsonreq);
    }
}
