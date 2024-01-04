package com.example.calanoc_ex4;

import android.content.Context;
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

    public RecipeAdapter(Context context, List<Recipe> recipes) {
        super(context, 0, recipes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_recipe, parent, false);
        }

        Recipe currentRecipe = getItem(position);

        ImageView recipeImage = listItemView.findViewById(R.id.recipeImage);
        recipeImage.setImageResource(currentRecipe.getImageResourceId());

        TextView recipeName = listItemView.findViewById(R.id.recipeName);
        recipeName.setText(currentRecipe.getName());

        return listItemView;
    }

}
