package com.example.orbit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class timerpage extends AppCompatActivity {
    private EditText timeEditText;
    private Button button4;
    private TextView countdownTextView;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timerpage);

        timeEditText = findViewById(R.id.timeEditText);
        button4 = findViewById(R.id.button4);
        countdownTextView = findViewById(R.id.countdownTextView);


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });
    }

    private void startTimer() {
        String timeText = timeEditText.getText().toString();
        if (!timeText.isEmpty()) {
            long timeInMillis = Long.parseLong(timeText) * 1000; // Convert seconds to milliseconds
            countDownTimer = new CountDownTimer(timeInMillis, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    timeLeftInMillis = millisUntilFinished;
                    updateCountdownText();
                }

                @Override
                public void onFinish() {
                    countdownTextView.setText("Countdown: 0");
                }
            }.start();
        }
    }

    private void updateCountdownText() {
        long seconds = timeLeftInMillis / 1000;
        countdownTextView.setText("Countdown: " + seconds);
    }
}

