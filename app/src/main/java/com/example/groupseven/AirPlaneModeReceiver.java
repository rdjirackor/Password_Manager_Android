package com.example.groupseven;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirPlaneModeReceiver  extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);

            // Perform any desired actions based on the Airplane Mode state
            if (isAirplaneModeOn) {
                Toast.makeText(context, "Airplane mode is on, baby", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "You nugget, turn it back on", Toast.LENGTH_SHORT).show();}

            }
    }


}
