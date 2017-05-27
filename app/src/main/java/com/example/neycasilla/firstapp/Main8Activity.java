package com.example.neycasilla.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        LinearLayout linear = (LinearLayout)findViewById(R.id.Linar);
        for(int i = 0; i<100;i++){
            Button btn = (Button) LayoutInflater.from(this).inflate(R.layout.boton,null);
            linear.addView(btn);
        }
    }
}
