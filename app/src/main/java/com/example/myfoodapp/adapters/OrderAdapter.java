package com.example.myfoodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.OrderModel;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    List<OrderModel> list;

    public OrderAdapter(List<OrderModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.product.setText(list.get(position).getProduct());
        holder.price.setText(list.get(position).getPrice());
        holder.count.setText(list.get(position).getCount());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView product, price, count;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            product = itemView.findViewById(R.id.product);
            price = itemView.findViewById(R.id.price);
            count = itemView.findViewById(R.id.count);
        }
    }


}
