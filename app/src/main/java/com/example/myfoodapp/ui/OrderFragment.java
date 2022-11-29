package com.example.myfoodapp.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.OrderAdapter;
import com.example.myfoodapp.models.OrderModel;

import java.util.ArrayList;
import java.util.List;

public class OrderFragment extends Fragment {

    List<OrderModel> list;
    OrderAdapter orderAdapter;
    RecyclerView recyclerView;

    public OrderFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order, container, false);

        recyclerView = view.findViewById(R.id.order_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new OrderModel("Pizza", "850", "x1"));
        list.add(new OrderModel("Cola", "500", "x2"));
        list.add(new OrderModel("Cupcake", "300", "x1"));

        orderAdapter = new OrderAdapter(list);
        recyclerView.setAdapter(orderAdapter);

        return view;
    }
}