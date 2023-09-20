package com.example.orbit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by its ID
        @SuppressLint("WrongViewCast") Button buttonGoToDestination = findViewById(R.id.imageButton4);

        // Set an OnClickListener for the button
        buttonGoToDestination.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// Define what happens when the button is clicked
                Intent intent = new Intent(MainActivity.this, homepage.class);
                startActivity(intent);

            }
        });
    }
}
