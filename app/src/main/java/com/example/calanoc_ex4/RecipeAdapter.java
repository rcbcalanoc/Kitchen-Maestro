package com.example.calanoc_ex4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class RecipeAdapter extends ArrayAdapter<Recipe> {

    private static List<Recipe> recipes; // Update to store the recipes

    private Context context;

    public RecipeAdapter(Context context, List<Recipe> recipes) {
        super(context, 0, recipes);
        this.context = context;
        this.recipes = recipes; // Store the recipes
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_recipe, parent, false);
        }

        final Recipe currentRecipe = getItem(position);

        if (currentRecipe != null) {
            ImageView recipeImage = listItemView.findViewById(R.id.recipeImage);
            int imageResource = context.getResources().getIdentifier(
                    currentRecipe.getImageName().toLowerCase().replaceAll("\\s+", "_"), "drawable", context.getPackageName());
            recipeImage.setImageResource(imageResource);

            TextView recipeName = listItemView.findViewById(R.id.recipeName);
            recipeName.setText(currentRecipe.getName());

            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, RecipeActivity.class);
                    intent.putExtra("recipeName", currentRecipe.getName());
                    intent.putExtra("recipeImageResource", imageResource);
                    context.startActivity(intent);
                }
            });
        }

        return listItemView;
    }

    public static List<Recipe> getRecipes() {
        return recipes;
    }
}
