package com.hackathon2020.hackathon2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mapbox.mapboxsdk.location.LocationComponent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button displayMapButton, placeTrashCanButton;
    public static ArrayList<LocationComponent> test = new ArrayList<LocationComponent>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayMapButton = (Button) findViewById(R.id.displayMapButton);
        placeTrashCanButton = (Button) findViewById(R.id.placeTrashCanButton);

        placeTrashCanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Clicked!");
                Intent intent = new Intent(MainActivity.this, PlaceTrashCanActivity.class);
                startActivity(intent);
            }
        });

        displayMapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);

                startActivity(intent);
            }

        });
    }
}