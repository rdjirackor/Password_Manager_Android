package com.example.groupseven;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginCreate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_create);
        TextView textView = findViewById(R.id.welmessage);
        textView.setTextColor(Color.BLACK);
        textView.setTypeface(null, Typeface.BOLD);


    }
}