package com.example.m07_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void nPagina2(View v){
        Intent i = new Intent(this, activity3.class);
        startActivity(i);
    }

    public void rPagina(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}