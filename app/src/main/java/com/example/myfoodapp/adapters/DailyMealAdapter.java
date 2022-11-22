package com.example.myfoodapp.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.activities.DetailedDailyMealActivity;
import com.example.myfoodapp.models.DailyMealModel;

import java.util.List;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.ViewHolder> {

    Context context;
    List<DailyMealModel> list;

    public DailyMealAdapter(Context context, List<DailyMealModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public DailyMealAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_meal_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DailyMealAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageview.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.discount.setText(list.get(position).getDiscount());
        holder.descriptions.setText(list.get(position).getDescriptions());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailedDailyMealActivity.class);
                intent.putExtra("type", list.get(position).getType());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imageview;
        TextView name, discount, descriptions;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.name);
            discount = itemView.findViewById(R.id.discount);
            descriptions = itemView.findViewById(R.id.descriptions);
        }
    }
}
