// RecipeAdapter.java
package com.example.calanoc_ex4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class RecipeAdapter extends ArrayAdapter<Recipe> {

    private Context context;

    public RecipeAdapter(Context context, List<Recipe> recipes) {
        super(context, 0, recipes);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_recipe, parent, false);
        }

        final Recipe currentRecipe = getItem(position);

        if (currentRecipe != null) {
            ImageView recipeImage = listItemView.findViewById(R.id.recipeImage);
            // Assuming your image resources are stored in the "drawable" folder
            int imageResource = context.getResources().getIdentifier(
                    currentRecipe.getImageName().toLowerCase().replaceAll("\\s+", "_"), "drawable", context.getPackageName());
            recipeImage.setImageResource(imageResource);


            TextView recipeName = listItemView.findViewById(R.id.recipeName);
            recipeName.setText(currentRecipe.getName());

            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create an intent to start RecipeDetailActivity
                    Intent intent = new Intent(context, RecipeActivity.class);

                    // Pass data to the intent
                    intent.putExtra("recipeName", currentRecipe.getName());
                    // Use the same identifier for image resource as the recipe name
                    intent.putExtra("recipeImageResource", imageResource);

                    // Start the RecipeDetailActivity
                    context.startActivity(intent);
                }
            });
        }

        return listItemView;
    }
}
