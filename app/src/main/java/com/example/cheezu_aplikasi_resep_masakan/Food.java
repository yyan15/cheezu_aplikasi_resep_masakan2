package com.example.cheezu_aplikasi_resep_masakan;

public class Food {

    int image;
    String title;

    public Food(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
