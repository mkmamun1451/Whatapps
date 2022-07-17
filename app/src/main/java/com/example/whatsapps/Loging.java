package com.example.whatsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Loging extends AppCompatActivity {


    private Button button;
    private TextView forgetTv, signupTv;
    private EditText numberEt,passwordEt;
    private ImageView facebookTv,googleTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loging);

       button = findViewById(R.id.matebutton);
       forgetTv = findViewById(R.id.forgetTv);
       signupTv = findViewById(R.id.singupTv);
       numberEt = findViewById(R.id.numberEt);
       passwordEt = findViewById(R.id.passEt);
       facebookTv = findViewById(R.id.faceTv);
       googleTv = findViewById(R.id.googleTv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Loging.this,Fristpage.class));
            }
        });


        signupTv.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(Loging.this,SingUp.class));
          }
      });

        forgetTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Loging.this,ForgetCode.class));

                Toast.makeText(Loging.this, "Place_Forget_Password", Toast.LENGTH_SHORT).show();
            }
        });




    }
}