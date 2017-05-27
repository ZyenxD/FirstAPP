package com.example.neycasilla.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = (TextView)findViewById(R.id.nombre);
        name.setText(R.string.name);
        Button linearLayoutVerticalButton = (Button)findViewById(R.id.boton);
        Button frameLayoutButton = (Button)findViewById(R.id.Frame);
        Button listLayoutButton = (Button)findViewById(R.id.List);
        Button gridLayoutButton = (Button)findViewById(R.id.Greed);
        linearLayoutVerticalButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public  void  onClick(View view){
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                });
        frameLayoutButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        Intent click = new Intent(MainActivity.this, Main5Activity.class);
                        startActivity(click);
                    }
                }
        );
        listLayoutButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        Intent touch = new Intent(MainActivity.this,Main6Activity.class);
                        startActivity(touch);
                    }
                }
        );
        gridLayoutButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        Intent touch = new Intent(MainActivity.this,Main7Activity.class);
                        startActivity(touch);
                    }
                }
        );

        }
    }

