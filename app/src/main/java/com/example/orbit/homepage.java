package com.example.orbit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
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
    }
}
