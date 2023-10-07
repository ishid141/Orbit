package com.example.orbit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    //Code for Timer
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        // Find the button by its ID
        View buttonGoToDestination = findViewById(R.id.button3);



        // Set an OnClickListener for the button
        buttonGoToDestination.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// Define what happens when the button is clicked
                Intent intent = new Intent(homepage.this, timerpage.class);
                startActivity(intent);

            }
        });

        //Code for Resources page
            // Find the button by its ID
        View buttonGoToDestination1 = findViewById(R.id.button2);
            /*Have to change variable everytime new button is added to this page
           so that it works because it's already attached to something
             */

        // Set an OnClickListener for the button
        buttonGoToDestination1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// Define what happens when the button is clicked
                Intent intent = new Intent(homepage.this, resourcepage.class);
                startActivity(intent);

            }
        });

        //Add planner page code here


















    }
}