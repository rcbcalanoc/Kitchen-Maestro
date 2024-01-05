package com.example.calanoc_ex4;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Filipino Spaghetti", "spaghetti"));
        recipes.add(new Recipe("Takoyaki", "takoyaki"));
        recipes.add(new Recipe("Yakisoba", "Yakisoba"));
        recipes.add(new Recipe("Rice Crackers", "senbei"));
        recipes.add(new Recipe("Ramen", "ramen"));
        recipes.add(new Recipe("Onigiri", "onigiri"));
        recipes.add(new Recipe("Crepes", "crepes"));

        RecipeAdapter adapter = new RecipeAdapter(this, recipes);
        listView.setAdapter(adapter);
    }
}
