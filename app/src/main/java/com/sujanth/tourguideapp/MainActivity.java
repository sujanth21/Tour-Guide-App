package com.sujanth.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button attractionsButton = (Button) findViewById(R.id.attractions_button);
        attractionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionActivity = new Intent(MainActivity.this, AttractionActivity.class);
                startActivity(attractionActivity);
            }
        });


        Button restaurantButton = (Button) findViewById(R.id.restaurant_button);
        restaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantActivity = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantActivity);
            }
        });

        Button shoppingButton = (Button) findViewById(R.id.shopping_button);
        shoppingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingActivity = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingActivity);
            }
        });
    }
}
