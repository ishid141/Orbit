package com.example.orbit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.net.Uri;

public class resourcepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resourcepage);


        //Start of Channel Code
        TextView textView = findViewById(R.id.textView5);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked
                //Open youtube Link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCEWpbFLzoYGPfuWUMFPSaoA"));
                startActivity(intent);


            }
        });

        //find textView with ID
        TextView textView1 = findViewById(R.id.textView4);
        //set onclick listener (responsible for responding to user actions)
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@brianmclogan?si=-FdlcflLe6aCqDob"));
                startActivity(intent);


            }
        });
        TextView textView2 = findViewById(R.id.textView6);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@AmoebaSisters?si=7swep-He-3-ElZJy"));
                startActivity(intent);


            }
        });

        TextView textView3 = findViewById(R.id.textView7);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@heimlershistory?si=FNzwh7v0WKxEGppd"));
                startActivity(intent);

            }
        });

        TextView textView4 = findViewById(R.id.textView8);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@GardenofEnglish?si=vZnuCYGIcZUr9VMB"));
                startActivity(intent);

            }
        });

        TextView textView5 = findViewById(R.id.textView9);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@Bozemanscience1?si=7QRaH9yGEvkq17Fg"));
                startActivity(intent);

            }
        });

        TextView textView6 = findViewById(R.id.textView10);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@MrSinn?si=23s3ha-CHaejF_GZ"));
                startActivity(intent);

            }
        });

        TextView textView7 = findViewById(R.id.textView11);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@MarcoLearning?si=N9W1lnLdYsGzpP6k"));
                startActivity(intent);

            }
        });


        //Start of Website Code

        TextView textView8 = findViewById(R.id.textView12);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.khanacademy.org"));
                startActivity(intent);

            }
        });

        TextView textView9 = findViewById(R.id.textView13);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://knowt.com"));
                startActivity(intent);

            }
        });

        TextView textView10 = findViewById(R.id.textView14);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fiveable.me"));
                startActivity(intent);

            }
        });

        TextView textView11 = findViewById(R.id.textView15);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paperrater.com"));
                startActivity(intent);

            }
        });

        TextView textView12 = findViewById(R.id.textView16);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the link is clicked (e.g., open a website)
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.litsolutions.org"));
                startActivity(intent);

            }
        });

    }



}