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
        recipes.add(new Recipe("Filipino Spaghetti", R.drawable.spaghetti));
        recipes.add(new Recipe("Takoyaki", R.drawable.takoyaki));
        recipes.add(new Recipe("Rice Crackers", R.drawable.senbei));
        recipes.add(new Recipe("Yakisoba", R.drawable.yakisoba));
        recipes.add(new Recipe("Ramen", R.drawable.ramen));
        recipes.add(new Recipe("Onigiri", R.drawable.onigiri));
        recipes.add(new Recipe("Crepes", R.drawable.crepes));

        // Add more recipes as needed

        RecipeAdapter adapter = new RecipeAdapter(this, recipes);
        listView.setAdapter(adapter);
    }
}
