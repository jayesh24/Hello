package com.suliteos.jayesh.lifeshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bdono extends AppCompatActivity implements View.OnClickListener {
EditText ed1,ed2,ed3,ed4,ed5,ed6;
TextView tv1,tv2,tv3,tv4,tv5,tv6;
Button btny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdono);
        ed1=findViewById(R.id.editText7);
        ed2=findViewById(R.id.editText8);
        ed3=findViewById(R.id.editText9);
        ed4=findViewById(R.id.editText11);
        ed5=findViewById(R.id.editText13);
        ed6=findViewById(R.id.editText14);
        btny=findViewById(R.id.buttonx);
        ed1.setOnClickListener(this);
        ed2.setOnClickListener(this);
        ed3.setOnClickListener(this);
        ed4.setOnClickListener(this);
        ed5.setOnClickListener(this);
        ed6.setOnClickListener(this);
        btny.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonx)
        {
            Toast.makeText(this,"Registered",Toast.LENGTH_SHORT).show();
        }


    }
}
