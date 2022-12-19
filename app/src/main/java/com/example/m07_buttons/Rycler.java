package com.example.m07_buttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_rycler);

        rycler();

    }


   public void rycler(){
       RecyclerView recycler = findViewById(R.id.recyclerView);
       List<Data> data = new ArrayList<>();

       data.add(new Data("Xavier Rodirguez", R.drawable.kfc));
       data.add(new Data("Aichi Sendou", R.drawable.kfc));
       data.add(new Data("Xavier Rodirguez", R.drawable.kfc));
       data.add(new Data("Aichi Sendou", R.drawable.kfc));

       recycler.setHasFixedSize(true);

       MyAdapter adapter = new MyAdapter(this, data);

       LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext());
       lm.setOrientation(LinearLayoutManager.VERTICAL);
       recycler.setLayoutManager(lm);
       recycler.setAdapter(adapter);
   }
}