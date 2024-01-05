package com.example.calanoc_ex4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class RecipeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_detail);

        // Get data from the intent
        Intent intent = getIntent();
        String recipeName = intent.getStringExtra("recipeName");
        int recipeImageResource = intent.getIntExtra("recipeImageResource", 0);

        // Set data to the views
        TextView detailRecipeName = findViewById(R.id.detailRecipeName);
        detailRecipeName.setText(recipeName);

        ImageView detailRecipeImage = findViewById(R.id.detailRecipeImage);
        detailRecipeImage.setImageResource(recipeImageResource);
    }
}
