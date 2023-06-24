package com.example.groupseven;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {
    private LinearLayout displayLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);

        displayLayout = findViewById(R.id.displayLayout);

        Button add = findViewById(R.id.cn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnterDetActivity();
            }
        });

        // Retrieve password and title values from SharedPreferences
        SharedPreferences preferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        String password = preferences.getString("password", "");
        String title = preferences.getString("title", "");

        if (!password.isEmpty() && !title.isEmpty()) {
            createTextView("Password: " + password + "\nTitle: " + title);
        }
    }

    private void createTextView(String text) {
        // Create a new TextView
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextColor(Color.BLACK);
        textView.setTypeface(null, Typeface.BOLD);

        // Add the TextView to the LinearLayout
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 0, 0, 16); // Set margins between TextViews
        textView.setLayoutParams(layoutParams);
        displayLayout.addView(textView);
    }

    public void openEnterDetActivity() {
        Intent intent = new Intent(this, EnterDetails.class);
        startActivity(intent);
    }
}
