package com.example.admin.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnExpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void maths (View view){
        Intent click = new Intent(MainActivity.this, maths.class);
        startActivity(click);
    }


    public void solveX (View view){
        Intent click = new Intent(MainActivity.this, solveforX.class);
        startActivity(click);
    }

    public void coordinates (View view){
        Intent click = new Intent(MainActivity.this, substitutions.class);
        startActivity(click);
    }
}
