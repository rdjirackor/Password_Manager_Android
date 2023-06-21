package com.example.groupseven;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.widget.Button;

/*Courage, find out how the back button works*/


public class MainActivity extends AppCompatActivity {
    /*Courage, open them MasterScreenCreation file, where the user will create a master password, and
    then add a password checking functionality, so if the user enters a password in the first line and then the second line
    has a different password entry, show that the user should correct it.
    Contact me if you don't get it, thanks
     */
    //TODO:ADD MASTER PASSWORD VERIFICATION

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        textView.setTextColor(Color.BLACK);
        textView.setTypeface(null, Typeface.BOLD);


        //This button below, will on being pressed move to th next pge which is the createAccount page (which doesn't technically create accounts, but I
        //misnamed it and stuck with that cuz im lazy, lol

        Button createAccount = findViewById(R.id.Continue);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openCreateActivity();

            }
        });
    }

    public void openCreateActivity(){
        Intent intent = new Intent(this, MasterScreenCreation.class );
        startActivity(intent);


    }
}