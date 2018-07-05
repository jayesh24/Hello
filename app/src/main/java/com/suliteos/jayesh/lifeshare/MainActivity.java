package com.suliteos.jayesh.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnn1, btnn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnn1 = findViewById(R.id.btn1);
        btnn2 = findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn4);
        btnn1.setOnClickListener(this);
        btnn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {

            Intent i=new Intent(this,bdono.class);
            startActivity(i);
            }


         if (v.getId()==R.id.btn2)
         {
             Intent i=new Intent(this,hospital.class);
             startActivity(i);
         }
         if (v.getId()==R.id.btn4)

         {
             Intent i=new Intent(this,Login.class);
             startActivity(i);
         }
    }
}