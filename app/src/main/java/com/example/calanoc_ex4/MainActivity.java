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
        recipes.add(new Recipe("Pasta", R.drawable.spaghetti));
        // Add more recipes as needed

        RecipeAdapter adapter = new RecipeAdapter(this, recipes);
        listView.setAdapter(adapter);
    }
}