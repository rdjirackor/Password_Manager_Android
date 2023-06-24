package com.example.groupseven;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        TextView first=findViewById(R.id.display1);
        TextView sec=findViewById(R.id.display2);
        TextView thi=findViewById(R.id.display3);
        TextView fou=findViewById(R.id.display4);
        TextView five=findViewById(R.id.display5);
        TextView six=findViewById(R.id.display6);
        TextView seven=findViewById(R.id.display7);
        TextView eig=findViewById(R.id.display8);
        TextView nine=findViewById(R.id.display9);
        TextView ten=findViewById(R.id.display10);
        TextView eleven=findViewById(R.id.display11);
        TextView twelve=findViewById(R.id.display12);
        TextView thirteen=findViewById(R.id.display13);
        TextView fourteen=findViewById(R.id.display14);
        TextView fifteen=findViewById(R.id.display15);
        TextView sixteen=findViewById(R.id.display16);
// breakpoint
        first.setTextColor(Color.BLACK);
        first.setTypeface(null, Typeface.BOLD);
        sec.setTextColor(Color.BLACK);
        sec.setTypeface(null, Typeface.BOLD);
        thi.setTextColor(Color.BLACK);
        thi.setTypeface(null, Typeface.BOLD);
        fou.setTextColor(Color.BLACK);
        fou.setTypeface(null, Typeface.BOLD);

        Button add = findViewById(R.id.cn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnterDetActivity();
            }
        });
        /* Over here is where the problem of displaying om the texrview is, so there is a textview array
         and I wan it to move on to textview 2 if textview 1 is full and so on */
        TextView[] textViews = new TextView[] {
                first, sec, thi, fou, five, six, seven, eig, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen
        };

        SharedPreferences preferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);

        for (int i = 0; i < textViews.length; i++) {
            String title = preferences.getString("title" + (i + 1), "");
            String password = preferences.getString("password" + (i + 1), "");

            if (!title.isEmpty() && !password.isEmpty()) {
                textViews[i].setText(title + "\n" + password);
            }
        }

       /* String Password = preferences.getString("password", "");
        String Note = preferences.getString("note", "");
        String Acc = preferences.getString("acc", "");
        String title = preferences.getString("title", "");
        String username=preferences.getString("username","");*/
    }





    public void openEnterDetActivity() {
        Intent intent = new Intent(this, EnterDetails.class);
        startActivity(intent);
    }
}