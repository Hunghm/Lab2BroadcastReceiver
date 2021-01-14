package com.example.lab2broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastBai3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String content = intent.getStringExtra(Bai3.CONTENT);
        boolean traLoi;
        try {
            if (check(content)) {
                if (content.trim().equalsIgnoreCase("MEM537128")) {
                    Toast.makeText(context, "Khuyến mãi 10%", Toast.LENGTH_SHORT).show();
                    traLoi = true;
                } else {
                    traLoi = false;
                }
                if (content.trim().equalsIgnoreCase("MEM537129")) {
                    Toast.makeText(context, "Khuyến mãi 20%", Toast.LENGTH_SHORT).show();
                    traLoi = true;
                } else {
                    traLoi = false;
                }
                if (content.trim().equalsIgnoreCase("VIP537128")) {
                    Toast.makeText(context, "Khuyến mãi 30%", Toast.LENGTH_SHORT).show();
                    traLoi = true;
                } else {
                    traLoi = false;
                }
                if (content.trim().equalsIgnoreCase("VIP537129")) {
                    Toast.makeText(context, "Khuyến mãi 50%", Toast.LENGTH_SHORT).show();
                    traLoi = true;
                } else {
                    traLoi = false;
                }
                if (!traLoi) {
                    Toast.makeText(context, "Không có khuyến mãi", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(context, "Ban da nhap sai", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, "Loi xay ra", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean check(String content) throws Exception {
        if (content.trim().length() == 9) {
            return true;
        }
        if (content.trim().length() >= 3) {
            if (content.trim().substring(0, 3).equalsIgnoreCase("MEM") || content.trim().substring(0, 3).equalsIgnoreCase("VIP")) {
                return true;
            }
        }
        return false;
    }
}
