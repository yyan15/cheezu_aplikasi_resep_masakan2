package com.example.cheezu_aplikasi_resep_masakan;

public class Recipe {

    int image;
    String title;
    String time;
    String description;
    boolean expanded;

    public Recipe(int image, String title, String time, String description) {
        this.image = image;
        this.title = title;
        this.time = time;
        this.description = description;
        this.expanded = false;
    }
}
