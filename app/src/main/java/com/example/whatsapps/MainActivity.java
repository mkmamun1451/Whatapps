package com.example.whatsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private ProgressBar proget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proget = findViewById(R.id.progEt);

        proget.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,Loging.class));
            }
        },4000);

    }
}