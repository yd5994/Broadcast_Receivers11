package com.example.homework11;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    boolean connection=false;

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_HEADSET_PLUG.equals(intent.getAction())&&connection){
            Toast.makeText(context, "You put the headphones in", Toast.LENGTH_SHORT).show();
            connection=false;
        }
        else{
            Toast.makeText(context, "You took off the headphones", Toast.LENGTH_SHORT).show();
            connection=true;
        }
    }
}
