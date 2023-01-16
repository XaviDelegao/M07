package com.example.m07_buttons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {

    Context context;
    public List<Data> data;
    public MyAdapter(Context context, List<Data> data) {

        this.context = context;
        this.data= data;
    }

    @NonNull
    @NotNull
    @Override
    public MyAdapter.viewHolder onCreateViewHolder(@NotNull @NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull @NonNull MyAdapter.viewHolder holder, int position) {

        holder.addData(data,position);
        int img = data.get(position).getImageID();
        holder.foto.setImageResource(img);
        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView nom;
        ImageView foto;
        public viewHolder(@NotNull @NonNull View itemView) {
            super(itemView);
            nom = itemView.findViewById(R.id.R_Nom);
            foto = itemView.findViewById(R.id.foto);
        }
        public void addData(List<Data> data, int position) {
            if (position <= data.size()) {
                String n = data.get(position).getNom();
                nom.setText(n);

            }
        }
    }


}