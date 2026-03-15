package com.example.cheezu_aplikasi_resep_masakan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {

    Context context;
    List<Recipe> recipeList;

    public RecipeAdapter(Context context, List<Recipe> recipeList) {
        this.context = context;
        this.recipeList = recipeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_recipe, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Recipe recipe = recipeList.get(position);

        holder.recipeTitle.setText(recipe.title);
        holder.recipeTime.setText(recipe.time);
        holder.recipeImage.setImageResource(recipe.image);
        holder.recipeDescription.setText(recipe.description);

        boolean isExpanded = recipe.expanded;
        holder.expandLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

        holder.mainLayout.setOnClickListener(v -> {
            recipe.expanded = !recipe.expanded;
            notifyItemChanged(position);
        });
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView recipeImage;
        TextView recipeTitle, recipeTime, recipeDescription;
        LinearLayout mainLayout, expandLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            recipeImage = itemView.findViewById(R.id.recipeImage);
            recipeTitle = itemView.findViewById(R.id.recipeTitle);
            recipeTime = itemView.findViewById(R.id.recipeTime);
            recipeDescription = itemView.findViewById(R.id.recipeDescription);
            mainLayout = itemView.findViewById(R.id.mainLayout);
            expandLayout = itemView.findViewById(R.id.expandLayout);
        }
    }
}