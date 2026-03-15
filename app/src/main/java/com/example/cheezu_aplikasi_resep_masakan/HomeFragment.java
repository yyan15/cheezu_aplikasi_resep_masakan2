package com.example.cheezu_aplikasi_resep_masakan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    List<Food> foodList;
    FoodAdapter adapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        foodList = new ArrayList<>();

        foodList.add(new Food(R.drawable.burger, "Burger"));
        foodList.add(new Food(R.drawable.pizza, "Pizza"));
        foodList.add(new Food(R.drawable.noodles, "Noodles"));
        foodList.add(new Food(R.drawable.sushi, "Sushi"));
        foodList.add(new Food(R.drawable.dumpling, "Dumplings"));
        foodList.add(new Food(R.drawable.onigiri, "Onigiri"));

        adapter = new FoodAdapter(getContext(), foodList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}