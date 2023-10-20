package com.example.orbit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class plannerpage extends AppCompatActivity {
    private Button addTodoButton;
    private LinearLayout todoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plannerpage);

        addTodoButton = findViewById(R.id.addTodoButton);
        todoList = findViewById(R.id.todoList);
    }

    public void addTodoItem(View view) {
        TextView newTodo = new TextView(this);
        newTodo.setText("New To-Do Item");
        todoList.addView(newTodo);

    }
}