package com.example.groupseven;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Dude!", Toast.LENGTH_SHORT).show();
    }
}
