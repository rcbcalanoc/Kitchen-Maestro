package com.example.calanoc_ex4;

public class Recipe {
    private String name;
    private String imageName; // Add this field

    public Recipe(String name, String imageName) {
        this.name = name;
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public String getImageName() { // Add this method
        return imageName;
    }
}

