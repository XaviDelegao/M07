package com.example.m07_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void nPagina3(View v){
        Intent i = new Intent(this, activity4.class);
        startActivity(i);


    }
    public void rPagina(View v){
        Intent i = new Intent(this, activity2.class);
        startActivity(i);


    }
}