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
    private Button button6;
    private boolean isPaused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timerpage);

        timeEditText = findViewById(R.id.timeEditText);
        button4 = findViewById(R.id.button4);
        countdownTextView = findViewById(R.id.countdownText);



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglePause();
            }
        });

    }
    private void togglePause() {
        if (countDownTimer != null) {
            if (isPaused) {
                // Resume the timer
                countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
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

                isPaused = false;
            } else {
                // Pause the timer
                countDownTimer.cancel();
                isPaused = true;
            }
        }
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
        long hours = timeLeftInMillis / 3600000; // 1 hour = 3600000 milliseconds
        long minutes = (timeLeftInMillis % 3600000) / 60000; // 1 minute = 60000 milliseconds
        long seconds = (timeLeftInMillis % 60000) / 1000; // 1 second = 1000 milliseconds

        countdownTextView.setText("Time Left: " + hours + "h " + minutes + "m " + seconds + "s");
    }

}

