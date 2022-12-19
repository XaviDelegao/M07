package com.example.m07_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void nPagina4(View v){
        Intent i = new Intent(this, activity5.class);
        startActivity(i);


    }
    public void rPagina(View v){
        Intent i = new Intent(this, activity3.class);
        startActivity(i);


    }
}