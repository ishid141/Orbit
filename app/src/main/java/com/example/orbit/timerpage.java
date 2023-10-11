package com.example.orbit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

//This is defining the buttons
public class timerpage extends AppCompatActivity {
    private TextView textView6;
    private Button button4, button5, button6;
    private Handler handler;
    private long startTimeMillis;
    private boolean isTimerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timerpage);

        //This is starting the actual code
        textView6 = findViewById(R.id.textView6);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        handler = new Handler();

        button5.setOnClickListener(v -> button5());
        button4.setOnClickListener(v -> button4());
        button6.setOnClickListener(v -> button6());
    }
    private void button5() {
        if (!isTimerRunning) {
            startTimeMillis = System.currentTimeMillis();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    long elapsedTimeMillis = System.currentTimeMillis() - startTimeMillis;
                    updateTimer(elapsedTimeMillis);
                    handler.postDelayed(this, 1000); // Update every 1 second
                }
            }, 1000); // Initial delay of 1 second

            isTimerRunning = true;
            button5.setEnabled(false);
            button4.setEnabled(true);
            button6.setEnabled(true);
        }
    }

    private void button4() {
        isTimerRunning = false;
        button5.setEnabled(true);
        button4.setEnabled(false);
        button6.setEnabled(true);
    }

    private void button6() {
        isTimerRunning = false;
        updateTimer(0);
        button5.setEnabled(true);
        button4.setEnabled(false);
        button6.setEnabled(false);
    }

    private void updateTimer(long elapsedTimeMillis) {
        int seconds = (int) (elapsedTimeMillis / 1000);
        int minutes = seconds / 60;
        int hours = minutes / 60;

        seconds %= 60;
        minutes %= 60;

        String timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        textView6.setText(timeFormatted);

    }

}