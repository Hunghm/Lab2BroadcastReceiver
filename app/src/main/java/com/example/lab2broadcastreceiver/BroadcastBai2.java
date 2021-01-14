package com.example.lab2broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadcastBai2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String content = intent.getStringExtra(Bai2.CONTENT_BAI2);
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }
}
