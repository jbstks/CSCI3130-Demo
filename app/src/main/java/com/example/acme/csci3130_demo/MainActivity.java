package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author Joanna Bistekos (B00710704)
 *
 * Followed tutorial at
 * https://developer.android.com/training/basics/firstapp/starting-activity#java
 * making modifications where necessary
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Function to be called when the SEND button is pressed by the user
     *
     * @param view the view object that was clicked
     */
    public void sendMessage(View view) {
        // Updates the value in textView2
        EditText editText = findViewById(R.id.inputField);
        String message = editText.getText().toString();
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
