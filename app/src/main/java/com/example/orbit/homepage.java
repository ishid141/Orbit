package com.example.orbit;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

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
        ImageButton imageButtonPlanner = findViewById(R.id.imageButton5);
        imageButtonPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, plannerpage.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Resource button
        ImageButton imageButtonResource = findViewById(R.id.imageButton7);
        imageButtonResource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, resourcepage.class);
                startActivity(intent);
            }
        });


        // Set OnClickListener for Timer button
        ImageButton imageButtonTimer = findViewById(R.id.imageButton6);
        imageButtonTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, timerpage.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Home button
        ImageButton imageButtonHome = findViewById(R.id.imageButton8);
        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, homepage.class);
                startActivity(intent);
            }
        });
        ImageView imageView = findViewById(R.id.imageView);

        ObjectAnimator moveUp = ObjectAnimator.ofFloat(imageView, "translationY", -500f);
        moveUp.setDuration(2000);

        // Define the translation animation to move the ImageView back to its starting position
        ObjectAnimator moveDown = ObjectAnimator.ofFloat(imageView, "translationY", +500f);
        moveDown.setDuration(2000);

        // Create an AnimatorSet to run the animations sequentially
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(moveUp, moveDown);

        moveUp.setRepeatCount(ValueAnimator.INFINITE);
        moveDown.setRepeatCount(ValueAnimator.INFINITE);

        // Set the repeat mode to reverse
        moveUp.setRepeatMode(ValueAnimator.REVERSE);
        moveDown.setRepeatMode(ValueAnimator.REVERSE);

        // Start the animation
        animatorSet.start();
    }
}
