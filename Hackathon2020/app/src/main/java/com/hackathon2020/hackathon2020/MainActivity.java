package com.hackathon2020.hackathon2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button displayMapButton, placeTrashCanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayMapButton = (Button) findViewById(R.id.displayMapButton);
        placeTrashCanButton = (Button) findViewById(R.id.placeTrashCanButton);

        displayMapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("Clicked!");
                Intent intent = new Intent(MainActivity.this, MapActivity.class);

                startActivity(intent);
            }

        });
    }
}