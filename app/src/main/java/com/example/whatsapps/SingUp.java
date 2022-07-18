package com.example.whatsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SingUp extends AppCompatActivity {

    private Button buttonSp;
    private EditText numberSp,emailSp,passSp,passwSp;
    private ImageView imageVw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        getSupportActionBar().hide();

        buttonSp = findViewById(R.id.buttonsup);
        numberSp = findViewById(R.id.phoneSup);
        emailSp = findViewById(R.id.emailSup);
        passSp = findViewById(R.id.passSup);
        passwSp = findViewById(R.id.passwSup);
        imageVw = findViewById(R.id.imageVw);

        buttonSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingUp.this,Loging.class));

                Toast.makeText(SingUp.this, "Successfully_Sing_Up", Toast.LENGTH_SHORT).show();
            }
        });


    }
}