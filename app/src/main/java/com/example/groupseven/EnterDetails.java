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

public class EnterDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_details);
        EditText Pass,Note,Title,Acc,Username;

        Username=findViewById(R.id.Username);
        Acc=findViewById(R.id.account);
        Title=findViewById(R.id.Title);
        Note=findViewById(R.id.Notes);
        Pass=findViewById(R.id.password);

        Pass.setTextColor(Color.BLACK);
        Note.setTextColor(Color.BLACK);
        Title.setTextColor(Color.BLACK);
        Acc.setTextColor(Color.BLACK);
        Username.setTextColor(Color.BLACK);

        Button save=findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = Pass.getText().toString();
                String note = Note.getText().toString();
                String title = Title.getText().toString();
                String acc = Acc.getText().toString();
                String username = Username.getText().toString();

                SharedPreferences preferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("password", pass);
                editor.putString("note",note);
                editor.putString("title",title);
                editor.putString("acc",acc);
                editor.putString("username",username);
                editor.apply();
                Toast.makeText(EnterDetails.this,"Saved!",Toast.LENGTH_LONG).show();
                openCreateAccount();
            }
        });








    }
    public void openCreateAccount(){
        Intent intent = new Intent(this, CreateAccount.class );
        startActivity(intent);
    }
}

        /* @Override
        public void onBackPressed() {
            // Navigate to MainActivity when the back button is pressed
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }*/



