package com.example.calanoc_ex4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Filipino Spaghetti", "spaghetti", R.string.spaghetti_instruction));
        recipes.add(new Recipe("Takoyaki", "takoyaki", R.string.takoyaki_instruction));
        recipes.add(new Recipe("Yakisoba", "Yakisoba", R.string.yakisoba_instruction));
        recipes.add(new Recipe("Rice Crackers", "senbei", R.string.senbei_instruction));
        recipes.add(new Recipe("Ramen", "ramen", R.string.ramen_instruction));
        recipes.add(new Recipe("Onigiri", "onigiri", R.string.onigiri_instruction));
        recipes.add(new Recipe("Crepes", "crepes", R.string.crepes_instruction));

        RecipeAdapter adapter = new RecipeAdapter(this, recipes);
        listView.setAdapter(adapter);
    }
}
