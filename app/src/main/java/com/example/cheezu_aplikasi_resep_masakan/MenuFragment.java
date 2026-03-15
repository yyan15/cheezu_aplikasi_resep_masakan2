package com.example.cheezu_aplikasi_resep_masakan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment {

    RecyclerView recyclerView;
    RecipeAdapter adapter;
    List<Recipe> recipeList;

    public MenuFragment() {
        // Required empty public constructor
    }

    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewMenu);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        DividerItemDecoration divider =
                new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(divider);

        recipeList = new ArrayList<>();

        recipeList.add(new Recipe(
                R.drawable.burger,
                "Burger",
                "20 minutes",
                "Ingredients:\n- Burger bun\n- Beef patty\n- Lettuce\n- Cheese\n\nSteps:\n1. Grill the beef patty.\n2. Toast the burger buns.\n3. Assemble the bun, patty, lettuce, and cheese.\n4. Add sauce and serve."
        ));

        recipeList.add(new Recipe(
                R.drawable.pizza,
                "Pizza",
                "30 minutes",
                "Ingredients:\n- Pizza dough\n- Tomato sauce\n- Mozzarella cheese\n\nSteps:\n1. Spread tomato sauce on the dough.\n2. Add cheese and toppings.\n3. Bake in the oven for 15–20 minutes."
        ));

        recipeList.add(new Recipe(
                R.drawable.noodles,
                "Noodles",
                "10 minutes",
                "Ingredients:\n- Noodles\n- Vegetables\n- Soy sauce\n\nSteps:\n1. Boil the noodles.\n2. Stir-fry vegetables in a pan.\n3. Add noodles and soy sauce.\n4. Mix well and serve."
        ));

        recipeList.add(new Recipe(
                R.drawable.sushi,
                "Sushi",
                "25 minutes",
                "Ingredients:\n- Sushi rice\n- Nori (seaweed)\n- Fish or vegetables\n\nSteps:\n1. Spread sushi rice on the nori sheet.\n2. Add fish or vegetables.\n3. Roll tightly.\n4. Slice into pieces and serve."
        ));

        recipeList.add(new Recipe(
                R.drawable.dumpling,
                "Dumplings",
                "20 minutes",
                "Ingredients:\n- Dumpling wrappers\n- Minced meat\n\nSteps:\n1. Place filling in the wrapper.\n2. Fold and seal the dumpling.\n3. Steam or pan-fry until cooked."
        ));

        recipeList.add(new Recipe(
                R.drawable.onigiri,
                "Onigiri",
                "10 minutes",
                "Ingredients:\n- Cooked rice\n- Nori (seaweed)\n\nSteps:\n1. Shape the rice into a triangle.\n2. Add filling if desired.\n3. Wrap with nori and serve."
        ));

        adapter = new RecipeAdapter(getContext(), recipeList);

        recyclerView.setAdapter(adapter);

        return view;
    }
}