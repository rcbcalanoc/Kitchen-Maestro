package com.example.calanoc_ex4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_detail);

        // Get data from the intent
        Intent intent = getIntent();
        String recipeName = intent.getStringExtra("recipeName");
        int recipeImageResource = intent.getIntExtra("recipeImageResource", 0);

        // Find the Recipe object based on the name
        Recipe selectedRecipe = findRecipeByName(recipeName);

        // Set data to the views
        TextView detailRecipeName = findViewById(R.id.detailRecipeName);
        detailRecipeName.setText(recipeName);

        TextView detailRecipeInstructions = findViewById(R.id.detailRecipeInstructions);
        detailRecipeInstructions.setText(selectedRecipe != null ?
                getString(selectedRecipe.getInstructionsResourceId()) : "");

        ImageView detailRecipeImage = findViewById(R.id.detailRecipeImage);
        detailRecipeImage.setImageResource(recipeImageResource);
    }

    // Helper method to find the Recipe object by name
    private Recipe findRecipeByName(String recipeName) {
        for (Recipe recipe : RecipeAdapter.getRecipes()) {
            if (recipe.getName().equals(recipeName)) {
                return recipe;
            }
        }
        return null;
    }
}
