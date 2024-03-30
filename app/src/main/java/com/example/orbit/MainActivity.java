package com.example.orbit;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputEditText = findViewById(R.id.textInputEditText);
        ImageButton buttonGoToDestination = findViewById(R.id.imageButton4);

        buttonGoToDestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textInputEditText.getText().toString().trim();
                if (!name.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, homepage.class);
                    intent.putExtra("NAME", name);
                    startActivity(intent);
                }
            }
        });
    }
}
