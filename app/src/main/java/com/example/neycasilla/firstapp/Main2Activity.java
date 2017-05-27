package com.example.neycasilla.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button GotoActOne = (Button)findViewById(R.id.backToOne);
        Button GotoActThree = (Button)findViewById(R.id.backToThree);
        GotoActThree.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view){
                        Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                        startActivity(intent);
                    }

                }

        );
        GotoActOne.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view){
                        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                        startActivity(intent);
                    }

                }

        );
    }
}
