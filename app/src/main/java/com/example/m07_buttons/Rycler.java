package com.example.m07_buttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rycler extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_rycler);


       RecyclerView recycler = findViewById(R.id.recyclerView);
       List<Data> data = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            data.add(new Data("Resultat #" + i + " ", R.drawable.kfc));

        }


        recycler.setLayoutManager(new GridLayoutManager(this,2));
       MyAdapter adapter = new MyAdapter(this, data);
        recycler.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
        recycler.setItemAnimator(new DefaultItemAnimator());
       recycler.setAdapter(adapter);

   }
}