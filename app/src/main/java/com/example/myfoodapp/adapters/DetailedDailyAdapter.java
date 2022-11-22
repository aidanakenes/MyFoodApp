package com.example.myfoodapp.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.DetailedDailyModel;

import java.util.List;

public class DetailedDailyAdapter extends RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder> {

    List<DetailedDailyModel> list;

    public DetailedDailyAdapter(List<DetailedDailyModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageview.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.price.setText(list.get(position).getPrice());
        holder.description.setText(list.get(position).getDescription());
        holder.rating.setText(list.get(position).getRating());
        holder.timing.setText(list.get(position).getTiming());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imageview;
        TextView name, description, rating, price, timing;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            description = itemView.findViewById(R.id.detailed_description);
            rating = itemView.findViewById(R.id.detailed_rating);
            price = itemView.findViewById(R.id.detailed_price);
            timing = itemView.findViewById(R.id.detailed_timing);
        }
    }
}

