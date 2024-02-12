package com.example.homework11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView count,count2;
    boolean checkData = false;

    private MyReceiver myReceiver = new MyReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.textView3);
        count2 = findViewById(R.id.textView4);
    }


    @Override
    protected void onStart() {
        super.onStart();

        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        registerReceiver(myReceiver, intentFilter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myReceiver);
    }
    public void startBroadcastReceivers(View view) {

//        if(!checkData){
//
////            myReceiver= new MyReceiver();
//
//            IntentFilter connectFilter = new IntentFilter();
//            connectFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
//
//            registerReceiver(myReceiver, connectFilter);
//            checkData = true;
//        }
//        else {
//            unregisterReceiver(myReceiver);
//            checkData = false;
//        }
//        Intent intent =new Intent();
//        intent.setAction("com.example.homework11");
//        intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//        sendBroadcast(intent);
    }
}