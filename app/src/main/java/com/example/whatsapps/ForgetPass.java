package com.example.whatsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPass extends AppCompatActivity {

    private Button forgetBt;
    private EditText passForget, currentFg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        forgetBt = findViewById(R.id.buttonForget);
        passForget = findViewById(R.id.passForg);
        currentFg = findViewById(R.id.passwForge);

        forgetBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgetPass.this,Loging.class));
                Toast.makeText(ForgetPass.this, "Successfully_Created_Password", Toast.LENGTH_SHORT).show();
            }
        });

    }
}