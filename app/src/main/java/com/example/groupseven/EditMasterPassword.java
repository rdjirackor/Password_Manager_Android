package com.example.groupseven;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class EditMasterPassword extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_maspass);
        EditText changer=findViewById(R.id.reseter);
        Button save=findViewById(R.id.theSave);

        save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String Tit = Title.getText().toString();
                        String Pas = Pass.getText().toString();
                        String Acco = Acc.getText().toString();
                        String Usernamo = Username.getText().toString();

                        Intent resultIntent = new Intent();
                        resultIntent.putExtra("description", "Title:"+Tit +"\n"+"Password:"+Pas+"\n"+"Account:"+Acco+"\n"+"Password:"+Pas+"\n"+"Username:"+Usernamo);
                        setResult(RESULT_OK, resultIntent);
                        finish();
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(EnterDetails.this, display, duration);
                        toast.show();

                    }
                });
    }
    public void openCreateAccount(){
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }
}
