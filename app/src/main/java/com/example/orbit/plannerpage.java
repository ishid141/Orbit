package com.example.orbit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class plannerpage extends AppCompatActivity {
    private Button addTodoButton;
    private LinearLayout todoList;
    private EditText todoInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plannerpage);

        addTodoButton = findViewById(R.id.addTodoButton);
        todoInput = findViewById(R.id.todoInput);
        todoList = findViewById(R.id.todoList);

    }

    public void addTodoItem(View view) {

        String newTodoText = todoInput.getText().toString();

        if (!newTodoText.isEmpty()){

            TextView newTodo = new TextView(this);
            newTodo.setText(newTodoText);

            todoList.addView(newTodo);

            todoInput.setText("");
        }


    }
}