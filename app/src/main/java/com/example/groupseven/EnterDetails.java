package com.example.groupseven;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// EnterDetails.java

public class EnterDetails extends AppCompatActivity {
    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_details);
        EditText Pass,Note,Title,Acc,Username;
        String display="Added!";
        Pass = findViewById(R.id.password);
        Username=findViewById(R.id.Username);
        Acc=findViewById(R.id.account);
        Title=findViewById(R.id.Title);
        Note=findViewById(R.id.Notes);

        Pass.setTextColor(Color.BLACK);
        Note.setTextColor(Color.BLACK);
        Title.setTextColor(Color.BLACK);
        Acc.setTextColor(Color.BLACK);
        Username.setTextColor(Color.BLACK);
        Button save = findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String Tit = Title.getText().toString();
                        String Pas = Pass.getText().toString();
                        Intent resultIntent = new Intent();
                        resultIntent.putExtra("description", "Title:"+Tit +"\n"+"Password:"+Pas);
                        setResult(RESULT_OK, resultIntent);
                        finish();
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(EnterDetails.this, display, duration);
                        toast.show();

                    }
                });

                }

            public void returnBack(View view) {
                finish();
            }
        }

