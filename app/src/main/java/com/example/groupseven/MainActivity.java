package com.example.groupseven;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.os.Bundle;
import android.graphics.Typeface;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    
    //TODO:ADD MASTER PASSWORD VERIFICATION
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelId = "my_channel_id"; // Choose any unique channel ID
            CharSequence channelName = "My Channel"; // The name of the channel
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, importance);
            notificationManager.createNotificationChannel(notificationChannel);
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
            mBuilder.setSmallIcon(R.drawable.padlock);
            mBuilder.setContentTitle("One test");
            mBuilder.setContentText("This is the way, Its gonna be around here!");
            AirPlaneModeReceiver Al = new AirPlaneModeReceiver();
            MyReceiver Mr = new MyReceiver();
            registerReceiver(Mr, new IntentFilter(Intent.ACTION_POWER_CONNECTED));
            int notificationID = 1;
            Notification notification = mBuilder.build();

            TextView t1, t2;
            t1 = findViewById(R.id.textView);
            t2 = findViewById(R.id.textView4);
            registerReceiver(Al, new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));


            t1.setTextColor(Color.BLACK);
            t1.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
            t1.setTextSize(19);

            t2.setTextColor(Color.BLACK);
            t2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            t2.setTextSize(17);


            Button createAccount = findViewById(R.id.Continue);
            createAccount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get an instance of SharedPreferences
                    SharedPreferences preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

                    // Retrieve the password
                    String savedPassword = preferences.getString("password", "");
                    if (!savedPassword.equals("")) {
                        openLoginActivity();
                        notificationManager.notify(notificationID, notification);

                        registerReceiver(Mr, new IntentFilter(Intent.ACTION_POWER_CONNECTED));
                    } else {
                        openCreateActivity();
                    }
                }
            });
        }
    }

    public void openCreateActivity(){
        Intent intent = new Intent(this, MasterScreenCreation.class );
        startActivity(intent);
    }
    public void openLoginActivity(){
        Intent intent1 =new Intent(this, LoginCreate.class);
        startActivity(intent1);
    }
}
