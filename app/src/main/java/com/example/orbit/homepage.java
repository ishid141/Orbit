package com.example.orbit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Receive the name passed from MainActivity
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        // Find the TextView where you want to display the name
        TextView textViewWelcome = findViewById(R.id.textView3);

        // Display the received name in the TextView
        if (name != null && !name.isEmpty()) {
            textViewWelcome.setText("Hello, " + name + "!");
        }

        // Set OnClickListener for Planner button
        Button buttonPlanner = findViewById(R.id.button);
        buttonPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, plannerpage.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Resource button
        Button buttonResource = findViewById(R.id.button2);
        buttonResource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, resourcepage.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Timer button
        Button buttonTimer = findViewById(R.id.button3);
        buttonTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, timerpage.class);
                startActivity(intent);
            }
        });
    }
}
