package com.example.groupseven;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        TextView deleteAll, darkLight, about,setHead;
        DialogThing dialog = new DialogThing();
        ImageButton back=findViewById(R.id.backer);

        deleteAll = findViewById(R.id.delAll);
        darkLight = findViewById(R.id.darkLight);
        about = findViewById(R.id.about);
        setHead=findViewById(R.id.SettingsHeader);

        setHead.setTextColor(Color.BLACK);
        setHead.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        setHead.setTextSize(17);


        deleteAll.setTextColor(Color.BLACK);
        deleteAll.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        deleteAll.setTextSize(20);

        darkLight.setTextColor(Color.BLACK);
        darkLight.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        darkLight.setTextSize(20);

        about.setTextColor(Color.BLACK);
        about.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        about.setTextSize(20);

        back.setBackgroundColor(Color.TRANSPARENT);

        //back button onclick listener
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateAccount();
                finish();
            }
        });
        deleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                dialog.show(fragmentManager, "dialog");
            }
        });
    }
    public void openCreateAccount(){
        Intent intent=new Intent(this,CreateAccount.class);
        startActivity(intent);
    }
}
