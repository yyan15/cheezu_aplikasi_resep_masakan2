package com.example.cheezu_aplikasi_resep_masakan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
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

        recipeList = new ArrayList<>();

        recipeList.add(new Recipe(
                R.drawable.burger,
                "Burger",
                "20 menit",
                "Bahan:\n- Roti burger\n- Daging sapi\n- Selada\n- Keju\n\nLangkah:\n1. Panggang daging\n2. Susun roti, daging, sayur\n3. Tambahkan saus"
        ));

        recipeList.add(new Recipe(
                R.drawable.pizza,
                "Pizza",
                "30 menit",
                "Bahan:\n- Adonan pizza\n- Saus tomat\n- Keju\n\nLangkah:\n1. Oles saus pada adonan\n2. Tambahkan topping\n3. Panggang di oven"
        ));

        recipeList.add(new Recipe(
                R.drawable.noodles,
                "Noodles",
                "10 menit",
                "Bahan:\n- Mie\n- Sayuran\n- Kecap\n\nLangkah:\n1. Rebus mie\n2. Tumis bumbu\n3. Campurkan mie dengan bumbu"
        ));

        recipeList.add(new Recipe(
                R.drawable.sushi,
                "Sushi",
                "25 menit",
                "Bahan:\n- Nasi sushi\n- Rumput laut\n- Ikan\n\nLangkah:\n1. Siapkan nasi\n2. Letakkan di nori\n3. Gulung dan potong"
        ));

        recipeList.add(new Recipe(
                R.drawable.dumpling,
                "Dumplings",
                "20 menit",
                "Bahan:\n- Kulit dumpling\n- Daging cincang\n\nLangkah:\n1. Isi kulit dengan daging\n2. Lipat dumpling\n3. Kukus atau goreng"
        ));

        recipeList.add(new Recipe(
                R.drawable.onigiri,
                "Onigiri",
                "10 menit",
                "Bahan:\n- Nasi\n- Nori\n\nLangkah:\n1. Bentuk nasi segitiga\n2. Bungkus dengan nori\n3. Tambahkan isian jika suka"
        ));

        adapter = new RecipeAdapter(getContext(), recipeList);

        recyclerView.setAdapter(adapter);

        return view;
    }
}