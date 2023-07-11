package com.example.groupseven;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        TextView t1 = findViewById(R.id.name);
        TextView t2 = findViewById(R.id.det);

        t1.setTextColor(Color.BLACK);
        t1.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        t1.setTextSize(20);

        t2.setTextColor(Color.BLACK);
        t2.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        t2.setTextSize(20);


        ImageButton backButton = findViewById(R.id.backr);
        backButton.setBackgroundColor(Color.TRANSPARENT);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}



