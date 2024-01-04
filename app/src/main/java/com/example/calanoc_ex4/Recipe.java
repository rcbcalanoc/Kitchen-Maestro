package com.example.calanoc_ex4;

public class Recipe {
    private String name;
    private int imageResourceId;

    public Recipe(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
