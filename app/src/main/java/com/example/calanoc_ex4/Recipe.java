package com.example.calanoc_ex4;

public class Recipe {
    private String name;
    private String imageName;
    private int instructionsResourceId;

    public Recipe(String name, String imageName, int instructionsResourceId) {
        this.name = name;
        this.imageName = imageName;
        this.instructionsResourceId = instructionsResourceId;
    }

    public String getName() {
        return name;
    }

    public String getImageName() {
        return imageName;
    }

    public int getInstructionsResourceId() {
        return instructionsResourceId;
    }
}
