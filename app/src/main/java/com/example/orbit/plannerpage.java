package com.example.orbit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.app.AppCompatActivity;

public class plannerpage extends AppCompatActivity {
    private Button addTodoButton;
    private LinearLayout todoList;
    private EditText todoInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plannerpage);

        // Initialize the buttons/elements
        addTodoButton = findViewById(R.id.addTodoButton);
        todoInput = findViewById(R.id.todoInput);
        todoList = findViewById(R.id.todoList);

        // Set OnClickListener for Planner button
        ImageButton imageButtonPlanner = findViewById(R.id.imageButton5);
        imageButtonPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plannerpage.this, plannerpage.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Resource button
        ImageButton imageButtonResource = findViewById(R.id.imageButton7);
        imageButtonResource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plannerpage.this, resourcepage.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Timer button
        ImageButton imageButtonTimer = findViewById(R.id.imageButton6);
        imageButtonTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plannerpage.this, timerpage.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Home button
        ImageButton imageButtonHome = findViewById(R.id.imageButton8);
        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plannerpage.this, homepage.class);
                startActivity(intent);
            }
        });
    }

    // Call method when "addToDoButton" is clicked
    public void addTodoItem(View view) {
        // Input field text
        String newTodoText = todoInput.getText().toString();

        // Empty or not
        if (!newTodoText.isEmpty()){
            // LinearLayout for to-do
            LinearLayout todoItemLayout = new LinearLayout(this);
            todoItemLayout.setOrientation(LinearLayout.HORIZONTAL);
            todoItemLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
            ));

            // TextView = display the to-do item text
            TextView newTodo = new TextView(this);
            newTodo.setText(newTodoText);
            newTodo.setTextSize(20); // 18 is an example, set your desired text size
            newTodo.setTextColor(ContextCompat.getColor(this, R.color.white));
            todoItemLayout.addView(newTodo);

            // Delete button for EACH to-do
            Button deleteButton = new Button(this);
            deleteButton.setText("Delete");
            deleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    todoList.removeView(todoItemLayout);
                }
            });

            // Delete = remove to-do
            todoItemLayout.addView(deleteButton);

            // New to-do to list
            todoList.addView(todoItemLayout);
            // Clear for next to-do
            todoInput.setText("");
        }
    }
}
