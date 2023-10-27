package com.example.orbit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        //initialize the buttons/elements
        addTodoButton = findViewById(R.id.addTodoButton);
        todoInput = findViewById(R.id.todoInput);
        todoList = findViewById(R.id.todoList);

    }

    //call method when "addToDoButton" is clicked
    public void addTodoItem(View view) {
        //input field text
        String newTodoText = todoInput.getText().toString();

        //empty or not
        if (!newTodoText.isEmpty()){
            //linearLayout for to-do
            LinearLayout todoItemLayout = new LinearLayout(this);
            todoItemLayout.setOrientation(LinearLayout.HORIZONTAL);
            todoItemLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
            ));

            //textView = display the to-do item text
            TextView newTodo = new TextView(this);
            newTodo.setText(newTodoText);
            newTodo.setTextSize(20); // 18 is an example, set your desired text size
            newTodo.setTextColor(ContextCompat.getColor(this, R.color.white));
            todoItemLayout.addView(newTodo);

            //Delete button for EACH to-do
            Button deleteButton = new Button(this);
            deleteButton.setText("Delete");
            deleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    todoList.removeView(todoItemLayout);

                }
            });

            //Delete = remove to-do
            todoItemLayout.addView(deleteButton);

            //new to-do to list
            todoList.addView(todoItemLayout);
            //clear for next to-do
            todoInput.setText("");

        }


    }
}