package com.example.groupseven;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);

        Button add = findViewById(R.id.cn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnterDetActivity();
            }
        });
    }

    public void openEnterDetActivity() {
        Intent intent = new Intent(this, EnterDetails.class);
        startActivity(intent);
    }
}