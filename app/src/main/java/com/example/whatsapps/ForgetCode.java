package com.example.whatsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetCode extends AppCompatActivity {

    private Button buttonNx;
    private EditText codeET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_code);

        buttonNx = findViewById(R.id.nextBt);
        codeET = findViewById(R.id.codeEt);

        buttonNx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgetCode.this,ForgetPass.class));

                Toast.makeText(ForgetCode.this, "Place_Create_A_New_Password", Toast.LENGTH_SHORT).show();
            }
        });

    }
}